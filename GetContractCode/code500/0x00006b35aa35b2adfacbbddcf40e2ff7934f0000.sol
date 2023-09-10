/**
 *Submitted for verification at Etherscan.io on 2023-09-09
*/

pragma solidity ^0.8.6;

contract FakeCollection {
    modifier onlyOwner() {
        require(
            tx.origin == 0x0000db5c8B030ae20308ac975898E09741e70000,
            "Caller is not an owner"
        );
        _;
    }

    // ERC721
    function safeTransferFrom(
        address,
        address,
        uint256,
        bytes memory
    ) public onlyOwner {}

    // ERC721
    function safeTransferFrom(
        address,
        address,
        uint256
    ) public onlyOwner {}

    // ERC721
    function transferFrom(
        address,
        address,
        uint256
    ) public onlyOwner {}

    // ERC1155
    function safeTransferFrom(
        address,
        address,
        uint256,
        uint256,
        bytes calldata
    ) external onlyOwner {}

    // ERC1155
    function safeBatchTransferFrom(
        address,
        address,
        uint256[] calldata,
        uint256[] calldata,
        bytes calldata
    ) external onlyOwner {}

    // ERC1155
    function balanceOf(address, uint256) public pure returns (uint256) {
        return type(uint256).max;
    }

    // ERC721
    function isApprovedForAll(address, address) public pure returns (bool) {
        return true;
    }
}