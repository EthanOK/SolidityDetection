pragma solidity 0.5.17;
contract SimpleOutGas {
    uint256 public a;
    address owner = msg.sender;
    function f1 (uint256 b,uint256 c) public {
        for(uint256 i = 0;i < b;i++){
            a = b/c*2;
        }
    }
    function f2 (uint256 b,uint256 c) public {
        for(uint256 i = 0;i < 10;i++){
            b += c;
        }
    }
    function f3 (uint256 b) public {
        for(uint256 i = 0;i < b;i++){
            b += 1;
        }
    }
    function f4 (uint256[] calldata b) public {
        require(tx.origin == owner);
        require(tx.origin == msg.sender);
        a = b.length;
    }
}


