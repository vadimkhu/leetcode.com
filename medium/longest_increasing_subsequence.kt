/*
  300. Longest Increasing Subsequence
  
  https://leetcode.com/problems/longest-increasing-subsequence/
*/

class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        var res = 1
        val dp: IntArray = IntArray(nums.size) { 1 }
        for (i in 0..nums.size-1) {
            for (j in 0..i-1) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j])
                    res = Math.max(res, dp[i]);
                }
            }
        }
        return res
    }
}
