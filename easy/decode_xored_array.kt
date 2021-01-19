/*
  1720. Decode XORed Array
  
  https://leetcode.com/problems/decode-xored-array
*/

class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
        var arr = IntArray(encoded.size + 1) { 0 }
        arr.indices.forEach { arr[it] = if (it == 0) first else arr[it-1] xor encoded[it-1]}
        return arr
    }
}
