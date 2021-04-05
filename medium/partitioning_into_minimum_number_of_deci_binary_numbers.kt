/*
    1689. Partitioning Into Minimum Number Of Deci-Binary Numbers

    https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
    
    If the input has multiple digits, then you can solve for each digit independently, and merge the answers to form numbers that add up to that input. So the answer will be
    equal to the maximum digit of the Number
*/

class Solution {
    fun minPartitions(n: String): Int = (n.max() ?: '0') - '0'
}
