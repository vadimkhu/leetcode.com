/*
  763. Partition Labels

  https://leetcode.com/problems/partition-labels/
*/

class Solution {
    fun partitionLabels(S: String): List<Int> {
        var res = arrayListOf<Int>()
        var indices = Array<Int>(26) { -1 } 
        
        for (i in 0..S.length-1)
            indices[S[i]-'a'] = i
        
        var start: Int = 0
        var end: Int = 0
        
        while (start < S.length) {
            end = indices[S[start] - 'a']
            var j: Int = start
            while (j < end) {
                end = if (end < indices[S[j] - 'a']) indices[S[j] - 'a'] else end
                j++
            }
            res.add(end - start + 1)
            start = end + 1
        }
        
        return res
    }
}
