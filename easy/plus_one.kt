/*
  66. Plus One
  
  https://leetcode.com/problems/plus-one/
*/

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        for (i in digits.size-1 downTo 0) {
            var temp = digits[i] + carry
            digits[i] = temp % 10
            carry = temp / 10
        }
        if (carry > 0) {
            return IntArray(digits.size+1) { 
                if (it == 0) carry
                else digits[it-1]
            }
        }
        return digits
    }
}
