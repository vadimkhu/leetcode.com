/*
  1038. Binary Search Tree to Greater Sum Tree
  https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
*/

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
import java.util.Stack

class Solution {
    fun bstToGst(root: TreeNode?): TreeNode? {
        var cur = root;
        val s = Stack<TreeNode>()
        var sum = 0
        while (!s.empty() || cur != null) {
            while (cur != null) {
                s.push(cur)
                cur = cur.right
            }
            cur = s.pop()
            sum += cur.`val`
            cur.`val` = sum
            cur = cur.left
        }
        return root;        
    }
}
