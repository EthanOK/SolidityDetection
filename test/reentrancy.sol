contract Fund {
	mapping(address => uint256) balances;
	function Deposit() payable{
	balances[msg.sender] += msg.value;
	}
	function Withdraw(uint256 amount) payable{
		if (balances[msg.sender] > amount) {
		msg.sender.call.value(amount)("");
		balances[msg.sender] -= amount;
		} 
	} 
}