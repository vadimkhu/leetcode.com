/*
  49. Group Anagrams
  
  https://leetcode.com/problems/group-anagrams/
*/

class Solution {
    fun getKey(s: String): String {
        var f = IntArray(26)
        for (c in s) 
            f[c - 'a']++
        var out = StringBuilder()
        for (i in 0..25) {
            if (f[i] > 0) {
                out.append(i + 'a'.toInt())
                out.append(f[i])
            }
        }
        return out.toString();
    }
    
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var h = HashMap<String, ArrayList<String>>()
        for (s in strs) 
            h.getOrPut(getKey(s)) {
                ArrayList()
            }.add(s)
        return h.values.toList();
    }
}
