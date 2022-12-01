/*
  1704. Determine if String Halves Are Alike

  https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
*/

class Solution {
    fun halvesAreAlike(s: String): Boolean {
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val n = s.length
        var l = 0
        var r = 0
        for (i in 0 until n / 2) {
            if (vowels.contains(s[i])) l++
            if (vowels.contains(s[i+n/2])) r++ 
        }

        return l == r
    }
}
