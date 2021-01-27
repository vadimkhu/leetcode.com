/*
  66. Plus One
  
  https://leetcode.com/problems/plus-one/
*/

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        for (i in digits.size-1 downTo 0) {
            var temp = digits[i]
            digits[i] = (temp + carry) % 10
            carry = (temp + carry) / 10
        }
        if (carry > 0) {
            var number = IntArray(digits.size+1) { 
                if (it == 0) carry
                else digits[it-1]
            }
            return number
        }
        return digits
    }
}
