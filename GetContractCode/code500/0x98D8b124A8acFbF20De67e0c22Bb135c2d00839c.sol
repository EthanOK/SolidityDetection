// SPDX-License-Identifier: MIT
pragma solidity ^0.8.19;

// multiple token unlocks
contract GoodblocksBatchUnlock
{
    IGoodblocks GBContract = IGoodblocks(address(0x29B4Ea6B1164C7cd8A3a0a1dc4ad88d1E0589124));

    function batchUnlock(uint256[] memory _tokenIds) public payable
    {
        uint256 tokenValue = msg.value/_tokenIds.length;
        for(uint256 i=0; i<_tokenIds.length; ++i)
        {
            GBContract.unlockNextGeneration{value: tokenValue}(_tokenIds[i]);
        }
    }
}

// interface with the token contract
interface IGoodblocks
{
    function unlockNextGeneration(uint256 _tokenId) external payable;
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