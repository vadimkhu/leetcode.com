/*
  1365. How Many Numbers Are Smaller Than the Current Number
  
  https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
*/

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        var res = IntArray(nums.size) { 0 }
        nums.forEachIndexed { index, num ->
            res[index] = nums.count { num > it }
        }
        return res
    }
}
