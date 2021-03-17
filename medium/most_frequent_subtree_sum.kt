/*
    508. Most Frequent Subtree Sum
    
    https://leetcode.com/problems/most-frequent-subtree-sum/
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
    private fun dfsFindFSum(root: TreeNode?, freq: HashMap<Int, Int>) : Int {
        if (root == null) return 0
        val total = root.`val` + dfsFindFSum(root.left, freq) + dfsFindFSum(root.right, freq)
        freq[total] = freq.getOrDefault(total, 0) + 1
        return total
    }
    
    fun findFrequentTreeSum(root: TreeNode?): IntArray {
        val freq = HashMap<Int, Int>()
        dfsFindFSum(root, freq)
        val maxVal: Int = freq.maxBy { it.value }?.value ?: 0
        val res: IntArray = freq.filter { it.value == maxVal }.keys.toIntArray()
        return res
    }
}
