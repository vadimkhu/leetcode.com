/*
  1528. Shuffle String
  
  https://leetcode.com/problems/shuffle-string/submissions/
*/

class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        var res = CharArray(s.length)
        indices.forEachIndexed { i, v -> res[v] = s[i] }
        return String(res)
    }
}
