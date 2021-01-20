/*
  5. Longest Palindromic Substring
  
  https://leetcode.com/problems/longest-palindromic-substring/
  
  Solution: 
  https://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
*/

class Solution {
    fun longestPalindrome(s: String): String {
        var dp: Array<BooleanArray> = Array<BooleanArray>(s.length) { BooleanArray(s.length) } 
        var maxLength = 1
        var start = 0
        
        for (i in 0..s.length-1)
            dp[i][i] = true
 
        for (i in 0..s.length-2) {
            if (s[i] == s[i + 1]) {
                dp[i][i + 1] = true
                start = i;
                maxLength = 2;
            }
        }
 
        for (k in 3..s.length) {
            for (i in 0..s.length-k) {
                var j = i + k - 1
                dp[i][j] = dp[i+1][j-1] && s[i] == s[j]
                if (dp[i][j] && k > maxLength) {
                    start = i;
                    maxLength = k;
                }
            }
        }
        return s.substring(start, start + maxLength);            
    }
}
