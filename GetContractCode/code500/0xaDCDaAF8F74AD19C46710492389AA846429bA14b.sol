pragma solidity 0.8.19;

import "Ownable.sol";

interface IStableSwap {
    function get_dy_underlying(int128 i, int128 j, uint256 dx) external view returns (uint256);

    function fee() external view returns (uint256);
}

interface IEACAggregatorProxy {
    function latestAnswer() external view returns (int256);
}

interface ISpotOracle {
    function getPrice() external view returns (uint256);
}

contract SpotOracleAggregator is Ownable {
    ISpotOracle[] public oracles;

    constructor(ISpotOracle[] memory _oracles) {
        oracles = _oracles;
    }

    /**
        @notice Get the spot price of mkUSD, expressed as a whole number with a precision of 1e18
        @dev THIS ORACLE IS EASILY MANIPULATED! IT IS NOT ACCEPTABLE FOR ON-CHAIN USE!
     */
    function getPrice() external view returns (uint256) {
        uint total;
        for (uint i = 0; i < oracles.length; i++) {
            total += oracles[i].getPrice();
        }
        return total / oracles.length;
    }

    function oracleCount() external view returns (uint256) {
        return oracles.length;
    }

    function addOracle(ISpotOracle oracle) external onlyOwner {
        uint length = oracles.length;
        for (uint i = 0; i < length; i++) {
            if (oracles[i] == oracle) revert("Oracle already added");
        }
        oracles.push(oracle);
    }

    function removeOracle(ISpotOracle oracle) external onlyOwner {
        ISpotOracle last = oracles[oracles.length - 1];
        oracles.pop();
        if (last == oracle) return;
        uint length = oracles.length;
        for (uint i = 0; i < length; i++) {
            if (oracles[i] == oracle) {
                oracles[i] = last;
                return;
            }
        }
        revert("Oracle not found");
    }
}

contract SpotOracle {
    IStableSwap public constant MKUSD_FRAXP = IStableSwap(0x0CFe5C777A7438C9Dd8Add53ed671cEc7A5FAeE5);
    IEACAggregatorProxy public constant USDC_USD = IEACAggregatorProxy(0x8fFfFfd4AfB6115b954Bd326cbe7B4BA576818f6);

    /**
        @notice Get the spot price of mkUSD, expressed as a whole number with a precision of 1e18
        @dev THIS ORACLE IS EASILY MANIPULATED! IT IS NOT ACCEPTABLE FOR ON-CHAIN USE!
     */
    function getPrice() external view returns (uint256) {
        // amount received from swaping 1 mkUSD -> USDC, normalized to 1e18
        uint256 dy = MKUSD_FRAXP.get_dy_underlying(0, 2, 1e18) * 1e12;

        // mkusd/fraxbp fee, normalized to 1e18
        uint256 fee = (MKUSD_FRAXP.fee() + 1e10) * 1e8;

        // chainlink usdc/usd price, normalized to 1e18
        uint256 usdc = uint256(USDC_USD.latestAnswer()) * 1e10;

        return (dy * fee * usdc) / 1e36;
    }
}// SPDX-License-Identifier: MIT
// OpenZeppelin Contracts (last updated v4.7.0) (access/Ownable.sol)

pragma solidity ^0.8.0;

import "Context.sol";

/**
 * @dev Contract module which provides a basic access control mechanism, where
 * there is an account (an owner) that can be granted exclusive access to
 * specific functions.
 *
 * By default, the owner account will be the one that deploys the contract. This
 * can later be changed with {transferOwnership}.
 *
 * This module is used through inheritance. It will make available the modifier
 * `onlyOwner`, which can be applied to your functions to restrict their use to
 * the owner.
 */
abstract contract Ownable is Context {
    address private _owner;

    event OwnershipTransferred(address indexed previousOwner, address indexed newOwner);

    /**
     * @dev Initializes the contract setting the deployer as the initial owner.
     */
    constructor() {
        _transferOwnership(_msgSender());
    }

    /**
     * @dev Throws if called by any account other than the owner.
     */
    modifier onlyOwner() {
        _checkOwner();
        _;
    }

    /**
     * @dev Returns the address of the current owner.
     */
    function owner() public view virtual returns (address) {
        return _owner;
    }

    /**
     * @dev Throws if the sender is not the owner.
     */
    function _checkOwner() internal view virtual {
        require(owner() == _msgSender(), "Ownable: caller is not the owner");
    }

    /**
     * @dev Leaves the contract without owner. It will not be possible to call
     * `onlyOwner` functions anymore. Can only be called by the current owner.
     *
     * NOTE: Renouncing ownership will leave the contract without an owner,
     * thereby removing any functionality that is only available to the owner.
     */
    function renounceOwnership() public virtual onlyOwner {
        _transferOwnership(address(0));
    }

    /**
     * @dev Transfers ownership of the contract to a new account (`newOwner`).
     * Can only be called by the current owner.
     */
    function transferOwnership(address newOwner) public virtual onlyOwner {
        require(newOwner != address(0), "Ownable: new owner is the zero address");
        _transferOwnership(newOwner);
    }

    /**
     * @dev Transfers ownership of the contract to a new account (`newOwner`).
     * Internal function without access restriction.
     */
    function _transferOwnership(address newOwner) internal virtual {
        address oldOwner = _owner;
        _owner = newOwner;
        emit OwnershipTransferred(oldOwner, newOwner);
    }
}// SPDX-License-Identifier: MIT
// OpenZeppelin Contracts v4.4.1 (utils/Context.sol)

pragma solidity ^0.8.0;

/**
 * @dev Provides information about the current execution context, including the
 * sender of the transaction and its data. While these are generally available
 * via msg.sender and msg.data, they should not be accessed in such a direct
 * manner, since when dealing with meta-transactions the account sending and
 * paying for execution may not be the actual sender (as far as an application
 * is concerned).
 *
 * This contract is only required for intermediate, library-like contracts.
 */
abstract contract Context {
    function _msgSender() internal view virtual returns (address) {
        return msg.sender;
    }

    function _msgData() internal view virtual returns (bytes calldata) {
        return msg.data;
    }
}{
  "evmVersion": "istanbul",
  "optimizer": {
    "enabled": true,
    "runs": 200
  },
  "libraries": {
    "SpotOracle.sol": {}
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