/*
  1470. Shuffle the Array
  https://leetcode.com/problems/shuffle-the-array/
*/

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        return (0..n-1).fold(intArrayOf()) { acc, index ->
            acc + nums[index] + nums[index+n]
        }
    }
}
