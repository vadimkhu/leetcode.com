/*
  1480. Running Sum of 1d Array
  https://leetcode.com/problems/running-sum-of-1d-array/
*/

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var runningSum: IntArray = IntArray(nums.size);
        for (i in nums.indices) {
            var temp = 0;
            if (i > 0)
                temp = runningSum[i-1];
            runningSum[i] += temp + nums[i];
        }
        return runningSum;
    }
}
