pragma solidity 0.4.21;
contract SimpleDao {
    mapping(address => uint256) public balances;
    function test1(uint256 amount) public{
        if (balances[msg.sender] > amount) {
            require(msg.sender.call.value(amount)("test"));
            balances[msg.sender] -= amount;
        }
    }
    function test2(uint256 amount) public{
        if (balances[msg.sender] - amount > 0) {
            balances[msg.sender] -= amount;
        }
    }
    function test3(uint256 amount) public{
        if (balances[msg.sender] > amount) {
            balances[msg.sender] -= amount;
            msg.sender.call.value(amount)("test");
        }
        msg.sender.call.value(amount)("test");
    }
}

