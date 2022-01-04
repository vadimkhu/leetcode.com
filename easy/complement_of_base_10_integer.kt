/*
    1009. Complement of Base 10 Integer

    https://leetcode.com/problems/complement-of-base-10-integer/
*/

class Solution {
    fun bitwiseComplement(n: Int): Int {
        var temp = n
        var mask = 1.shl(n.toString(2).length) - 1
        return n.xor(mask)
    }
}
