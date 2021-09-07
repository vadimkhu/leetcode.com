/*
  205. Isomorphic Strings
  https://leetcode.com/problems/isomorphic-strings/
*/

class Solution {
    fun testFirstVsSecond(s: String, t: String) : Boolean {
        var h = HashMap<Char, Char>()
        var i = 0
        s.forEach {
            if (h.containsKey(it) && h[it] != t[i]) 
                return false
            h[it] = t[i]
            i++
        }
        return true
    }
    
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        if (testFirstVsSecond(s, t) == false) return false
        return testFirstVsSecond(t, s)        
    }
}
