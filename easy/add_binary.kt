/*
  67. Add Binary
  
  https://leetcode.com/problems/add-binary/
*/

class Solution {
    fun addBinary(x: String, y: String): String {
        var a = x.reversed()
        var b = y.reversed()
        var res: String = ""
        var carry = 0
        if (a.length < b.length)
            a = b.also { b = a }
        for (i in 0..b.length-1) {
            var sum = (a[i] - '0') + (b[i] - '0') + carry
            res += (sum % 2).toString()
            carry = (sum shr 1)
        }
        for (i in b.length..a.length-1) {
            var sum = (a[i] - '0') + carry
            res += (sum % 2).toString()
            carry = (sum shr 1)
        }
        if (carry == 1)
            res += "1"
        return res.reversed()
    }
}
