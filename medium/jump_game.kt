/*
    55. Jump Game
    
    https://leetcode.com/problems/jump-game/
*/
class Solution {
    fun canJump(nums: IntArray): Boolean {
        var arr = IntArray(nums.size) { 0 }
        arr[0] = nums[0]
        for (i in 1..nums.size-1) {
            if (arr[i-1] <= 0) return false
            arr[i] = Math.max(nums[i], arr[i-1] - 1)
        }
        return true
    }
}
