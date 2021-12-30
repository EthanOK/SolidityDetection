contract IntIssues{
	mapping(address => uint256) balances;
	function Deposit() payable{
		balances[msg.sender] += msg.value;
	}
	function Withdraw(uint256 amount) {
		require(balances[msg.sender] - amount > 0);
		msg.sender.transfer(amount);
		balances[msg.sender] -= amount;
	} 
}