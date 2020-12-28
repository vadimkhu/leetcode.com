/*
  1315. Sum of Nodes with Even-Valued Grandparent
  
  https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
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
class Solution {
    fun sumEvenGrandparent(root: TreeNode?): Int {
        if (root == null) return 0;
        var sum = 0
        
        if (root.`val` and 1 == 0) {
            sum += root.left?.left?.`val` ?: 0
            sum += root.left?.right?.`val` ?: 0
            sum += root.right?.left?.`val` ?: 0
            sum += root.right?.right?.`val` ?: 0
        }
        
        sum += sumEvenGrandparent(root.left)
        sum += sumEvenGrandparent(root.right)
        return sum
    }
}
