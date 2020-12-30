/*
  1313. Decompress Run-Length Encoded List
  
  https://leetcode.com/problems/decompress-run-length-encoded-list/
*/

class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        var res = mutableListOf<Int>()
        val last = nums.size / 2 - 1
        for (i in 0..last) {
            for (j in 0..nums[2*i]-1)
                res.add(nums[2*i+1])
        }
        return res.toIntArray()
    }
}
