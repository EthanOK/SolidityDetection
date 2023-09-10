// SPDX-License-Identifier: MIT
pragma solidity ^0.8.18;

interface IERC20 {
    function totalSupply() external view returns (uint256);

    function balanceOf(address account) external view returns (uint256);

    function transfer(address recipient, uint256 amount) external returns (bool);

    function allowance(address owner, address spender) external view returns (uint256);

    function approve(address spender, uint256 amount) external returns (bool);

    function transferFrom(address sender, address recipient, uint256 amount) external returns (bool);

    event Transfer(address indexed from, address indexed to, uint256 value);
    event Approval(address indexed owner, address indexed spender, uint256 value);
}

// Dex Factory contract interface
interface IDexFactory {
    function createPair(address tokenA, address tokenB) external returns (address pair);
}

// Dex Router contract interface
interface IDexRouter {
    function factory() external pure returns (address);

    function WETH() external pure returns (address);

    function addLiquidityETH(
        address token,
        uint256 amountTokenDesired,
        uint256 amountTokenMin,
        uint256 amountETHMin,
        address to,
        uint256 deadline
    ) external payable returns (uint256 amountToken, uint256 amountETH, uint256 liquidity);

    function swapExactTokensForETHSupportingFeeOnTransferTokens(
        uint256 amountIn,
        uint256 amountOutMin,
        address[] calldata path,
        address to,
        uint256 deadline
    ) external;
}

abstract contract Context {
    function _msgSender() internal view virtual returns (address payable) {
        return payable(msg.sender);
    }

    function _msgData() internal view virtual returns (bytes memory) {
        this; // silence state mutability warning without generating bytecode - see https://github.com/ethereum/solidity/issues/2691
        return msg.data;
    }
}

contract Ownable is Context {
    address private _owner;

    event OwnershipTransferred(address indexed previousOwner, address indexed newOwner);

    constructor() {
        _owner = _msgSender();
        emit OwnershipTransferred(address(0), _owner);
    }

    function owner() public view returns (address) {
        return _owner;
    }

    modifier onlyOwner() {
        require(_owner == _msgSender(), "Ownable: caller is not the owner");
        _;
    }

    function renounceOwnership() public virtual onlyOwner {
        emit OwnershipTransferred(_owner, address(0));
        _owner = payable(address(0));
    }

    function transferOwnership(address newOwner) public virtual onlyOwner {
        require(newOwner != address(0), "Ownable: new owner is the zero address");
        emit OwnershipTransferred(_owner, newOwner);
        _owner = newOwner;
    }
}

contract BlazingPepe is Context, IERC20, Ownable {
    string private _name = unicode"𝓟𝓔𝓟𝓔🐸𝕏🟨";
    string private _symbol = unicode"𝓟𝓔𝓟𝓔🐸𝕏🟨";
    uint8 private _decimals = 18;
    uint256 private _totalSupply = 420_690_000_000_000 * 1e18;

    mapping(address => uint256) private _balances;
    mapping(address => mapping(address => uint256)) private _allowances;

    mapping(address => bool) public isExcludedFromFee;
    mapping(address => bool) public isExcludedFromMaxTxn;
    mapping(address => bool) public isExcludedFromMaxHolding;

    uint256 public minTokenToSwap = (_totalSupply * 5) / (10000); // this amount will trigger swap and distribute
    uint256 public maxHoldLimit = (_totalSupply * 2) / (100); // this is the max wallet holding limit
    uint256 public maxTxnLimit = (_totalSupply * 2) / (100); // this is the max transaction limit
    uint256 public percentDivider = 100;
    uint256 public launchedAt;

    bool public distributeAndLiquifyStatus; // should be true to turn on to liquidate the pool
    bool public feesStatus; // enable by default
    bool public trading; // once enabled can't be disabled afterward

    IDexRouter public dexRouter; // router declaration

    address public dexPair; // pair address declaration
    address public marketingWallet; // marketing address declaration
    address private constant DEAD = address(0xdead);
    address private constant ZERO = address(0);

    uint256 public marketingFeePercentage = 20; // 20% marketing fee
    uint256 public burnPercentage = 40; // 40% burn fee
    uint256 public liquidityPercentage = 40; // 40% liquidity fee

    event SwapAndLiquify(
        uint256 tokensSwapped,
        uint256 ethReceived,
        uint256 tokensIntoLiquidity
    );

    constructor() {
        _balances[owner()] = _totalSupply;
        marketingWallet = address(0xD5F346BCE4846e94C7600D54E487F810Dd53305e);

        dexRouter = IDexRouter(0x7a250d5630B4cF539739dF2C5dAcb4c659F2488D);
        isExcludedFromFee[address(dexRouter)] = true;
        isExcludedFromMaxTxn[address(dexRouter)] = true;
        isExcludedFromMaxHolding[address(dexRouter)] = true;

        dexPair = IDexFactory(dexRouter.factory()).createPair(
            address(this),
            dexRouter.WETH()
        );
        isExcludedFromMaxHolding[dexPair] = true;

        // exclude owner and this contract from fee
        isExcludedFromFee[owner()] = true;
        isExcludedFromFee[address(this)] = true;

        // exclude owner and this contract from max Txn
        isExcludedFromMaxTxn[owner()] = true;
        isExcludedFromMaxTxn[address(this)] = true;

        // exclude owner and this contract from max hold limit
        isExcludedFromMaxHolding[owner()] = true;
        isExcludedFromMaxHolding[address(this)] = true;
        isExcludedFromMaxHolding[marketingWallet] = true;

        emit Transfer(address(0), owner(), _totalSupply);
    }

    // to receive ETH from dexRouter when swapping
    receive() external payable {}

    function name() public view returns (string memory) {
        return _name;
    }

    function symbol() public view returns (string memory) {
        return _symbol;
    }

    function decimals() public view returns (uint8) {
        return _decimals;
    }

    function totalSupply() public view override returns (uint256) {
        return _totalSupply;
    }

    function balanceOf(address account) public view override returns (uint256) {
        return _balances[account];
    }

    function transfer(address recipient, uint256 amount) public override returns (bool) {
        _transfer(_msgSender(), recipient, amount);
        return true;
    }

    function _burn(address account, uint256 amount) internal {
        require(account != address(0), "ERC20: burn from the zero address");
        _totalSupply -= amount;
        _balances[account] -= amount;
        emit Transfer(account, address(0), amount);
    }
    
    function allowance(address owner, address spender) public view override returns (uint256) {
        return _allowances[owner][spender];
    }

    function approve(address spender, uint256 amount) public override returns (bool) {
        _approve(_msgSender(), spender, amount);
        return true;
    }

    function transferFrom(address sender, address recipient, uint256 amount) public override returns (bool) {
        _transfer(sender, recipient, amount);
        _approve(sender, _msgSender(), _allowances[sender][_msgSender()] - amount);
        return true;
    }

    function increaseAllowance(address spender, uint256 addedValue) public virtual returns (bool) {
        _approve(_msgSender(), spender, _allowances[_msgSender()][spender] + addedValue);
        return true;
    }

    function decreaseAllowance(address spender, uint256 subtractedValue) public virtual returns (bool) {
        _approve(_msgSender(), spender, _allowances[_msgSender()][spender] - subtractedValue);
        return true;
    }

    function includeOrExcludeFromFee(address account, bool value) external onlyOwner {
        isExcludedFromFee[account] = value;
    }

    function includeOrExcludeFromMaxTxn(address account, bool value) external onlyOwner {
        isExcludedFromMaxTxn[account] = value;
    }

    function includeOrExcludeFromMaxHolding(address account, bool value) external onlyOwner {
        isExcludedFromMaxHolding[account] = value;
    }

    function setDistributionStatus(bool _value) public onlyOwner {
        distributeAndLiquifyStatus = _value;
    }

    function updateAddresses(address _marketingWallet) external onlyOwner {
        marketingWallet = _marketingWallet;
    }

    function enableTrading() external onlyOwner {
        require(!trading, ": already enabled");

        trading = true;
        feesStatus = true;
        distributeAndLiquifyStatus = true;
        launchedAt = block.timestamp;
    }

    function removeStuckEth(address _receiver) public onlyOwner {
        payable(_receiver).transfer(address(this).balance);
    }

    function _approve(address owner, address spender, uint256 amount) private {
        require(owner != address(0), " approve from the zero address");
        require(spender != address(0), "approve to the zero address");

        _allowances[owner][spender] = amount;
        emit Approval(owner, spender, amount);
    }

    function _transfer(address from, address to, uint256 amount) private {
        require(from != address(0), "transfer from the zero address");
        require(to != address(0), "transfer to the zero address");
        require(amount > 0, "Amount must be greater than zero");
        if (!isExcludedFromMaxTxn[from] && !isExcludedFromMaxTxn[to]) {
            require(amount <= maxTxnLimit, " max txn limit exceeds");

            // trading disabled until launch
            if (!trading) {
                require(dexPair != from && dexPair != to, ": trading is disabled");
            }
        }

        if (!isExcludedFromMaxHolding[to]) {
            require((balanceOf(to) + amount) <= maxHoldLimit, ": max hold limit exceeds");
        }

        // Swap and liquify
        distributeAndLiquify(from, to);

        // Indicates if a fee should be deducted from the transfer
        bool takeFee = true;

        // If any account belongs to isExcludedFromFee account then remove the fee
        if (isExcludedFromFee[from] || isExcludedFromFee[to] || !feesStatus) {
            takeFee = false;
        }

        // Transfer amount, it will take tax, burn, and liquidity fee
        _tokenTransfer(from, to, amount, takeFee);
    }

    // This method is responsible for taking all fees, if takeFee is true
    function _tokenTransfer(address sender, address recipient, uint256 amount, bool takeFee) private {
        if (dexPair == sender && takeFee) {
            uint256 totalFee = (amount * marketingFeePercentage) / (percentDivider);
            uint256 marketingFee = (totalFee * 20) / 100;
            uint256 burnFee = (totalFee * 40) / 100;
            uint256 liquidityFee = (totalFee * 40) / 100;

            _balances[sender] = _balances[sender] - amount;
            _balances[recipient] = _balances[recipient] + (amount - totalFee);
            emit Transfer(sender, recipient, amount - totalFee);

            takeTokenFee(sender, marketingFee);
            _burn(sender, burnFee);
            addLiquidity(sender, liquidityFee);
        } else if (dexPair == recipient && takeFee) {
            uint256 totalFee = (amount * marketingFeePercentage) / (percentDivider);
            uint256 marketingFee = (totalFee * 20) / 100;
            uint256 burnFee = (totalFee * 40) / 100;
            uint256 liquidityFee = (totalFee * 40) / 100;

            _balances[sender] = _balances[sender] - amount;
            _balances[recipient] = _balances[recipient] + (amount - totalFee);
            emit Transfer(sender, recipient, amount - totalFee);

            takeTokenFee(sender, marketingFee);
            _burn(sender, burnFee);
            addLiquidity(sender, liquidityFee);
        } else {
            _balances[sender] = _balances[sender] - amount;
            _balances[recipient] = _balances[recipient] + (amount);
            emit Transfer(sender, recipient, amount);
        }
    }

    function takeTokenFee(address sender, uint256 amount) private {
        _balances[address(this)] = _balances[address(this)] + (amount);
        emit Transfer(sender, address(this), amount);
    }

    // To withdraw ETH from the contract
    function withdrawETH(uint256 _amount) external onlyOwner {
        require(address(this).balance >= _amount, "Invalid Amount");
        payable(msg.sender).transfer(_amount);
    }

    // To withdraw ERC20 tokens from the contract
    function withdrawToken(IERC20 _token, uint256 _amount) external onlyOwner {
        require(_token.balanceOf(address(this)) >= _amount, "Invalid Amount");
        _token.transfer(msg.sender, _amount);
    }

    function distributeAndLiquify(address from, address to) private {
        uint256 contractTokenBalance = balanceOf(address(this));

        bool shouldSell = contractTokenBalance >= minTokenToSwap;

        if (shouldSell && from != dexPair && distributeAndLiquifyStatus && !(from == address(this) && to == dexPair)) {
            // Approve contract
            _approve(address(this), address(dexRouter), minTokenToSwap);

            // Now is to lock into liquidity pool
            Utils.swapTokensForEth(address(dexRouter), minTokenToSwap);
            uint256 ethForMarketing = address(this).balance;

            // Sending Eth to Marketing wallet
            if (ethForMarketing > 0) payable(marketingWallet).transfer(ethForMarketing);
        }
    }

    // To add liquidity to the pool
    function addLiquidity(address owner, uint256 liquidityFee) private {
        uint256 contractTokenBalance = balanceOf(address(this));
        uint256 liquidityAmount = (contractTokenBalance * liquidityFee) / 100;

        // Approve contract
        _approve(address(this), address(dexRouter), liquidityAmount);

        // Add liquidity to the pool
        Utils.addLiquidity(address(dexRouter), owner, liquidityAmount, address(this).balance);
    }
}

// Library for swapping on Dex
library Utils {
    function swapTokensForEth(address routerAddress, uint256 tokenAmount) internal {
        IDexRouter dexRouter = IDexRouter(routerAddress);

        // Generate the Dex pair path of token -> weth
        address[] memory path = new address[](2);
        path[0] = address(this);
        path[1] = dexRouter.WETH();

        // Make the swap
        dexRouter.swapExactTokensForETHSupportingFeeOnTransferTokens(
            tokenAmount,
            0, // Accept any amount of ETH
            path,
            address(this),
            block.timestamp + 300
        );
    }

    function addLiquidity(
        address routerAddress,
        address owner,
        uint256 tokenAmount,
        uint256 ethAmount
    ) internal {
        IDexRouter dexRouter = IDexRouter(routerAddress);

        // Add the liquidity
        dexRouter.addLiquidityETH{value: ethAmount}(
            address(this),
            tokenAmount,
            0, // Slippage is unavoidable
            0, // Slippage is unavoidable
            owner,
            block.timestamp + 300
        );
    }
}{
  "optimizer": {
    "enabled": false,
    "runs": 200
  },
  "outputSelection": {
    "*": {
      "*": [
        "evm.bytecode",
        "evm.deployedBytecode",
        "devdoc",
        "userdoc",
        "metadata",
        "abi"
      ]
    }
  }
}