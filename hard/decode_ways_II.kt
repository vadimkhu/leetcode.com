/*
  639. Decode Ways II
  
  https://leetcode.com/problems/decode-ways-ii/
*/

class Solution {
    fun numDecodings(s: String): Int {
        if (s.length == 0) return 0
        val mod = 1000000007
        var dp2 = 1
        var dp1 = if (s[0] == '0') 0 else if (s[0] == '*') 9 else 1
        var dp = if (s[0] == '0') 0 else if (s[0] == '*') 9 else 1
        for (i in 2..s.length) {
            dp = if (s[i-1] == '0') 0 else if (s[i-1] == '*') 9 * dp1 else dp1
            dp = (dp % mod) % mod
            
            if (s[i-2] == '1' && s[i-1] == '*') dp += dp2 * 9
            else if (s[i-2] == '2' && s[i-1] == '*') dp += dp2 * 6
            else if (s[i-2] == '*' && s[i-1] == '*') dp += dp2 * 15
            else if (s[i-2] == '*' && s[i-1] <= '6') dp += dp2 * 2
            else if (s[i-2] == '*' && s[i-1] >= '7') dp += dp2
            else if ((s[i-2] =='1' && s[i-1] != '*') || (s[i-2] =='2' && s[i-1] <= '6')) dp += dp2
            
            dp = (dp % mod) % mod
            dp2 = dp1
            dp1 = dp
        }
        return dp
    }
}
