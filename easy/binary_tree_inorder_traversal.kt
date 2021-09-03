/**
    94. Binary Tree Inorder Traversal
    https://leetcode.com/problems/binary-tree-inorder-traversal/
*/

class Solution {
    fun inorder(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) return
        inorder(root.left, list)
        list.add(root.`val`)
        inorder(root.right, list)
    }
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var list = mutableListOf<Int>()
        inorder(root, list)
        return list
    }
}
