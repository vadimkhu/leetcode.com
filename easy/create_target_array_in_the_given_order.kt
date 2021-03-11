/*
    1389. Create Target Array in the Given Order
    
    https://leetcode.com/problems/create-target-array-in-the-given-order/
*/

class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        var res: MutableList<Int> = mutableListOf<Int>()
        index.indices.forEach { id ->
            res.add(index[id], nums[id])
        }
        return res.toIntArray()
    }
}
