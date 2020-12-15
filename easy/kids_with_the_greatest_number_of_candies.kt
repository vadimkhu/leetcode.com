/*
  1431. Kids With the Greatest Number of Candies
  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        val maxCandies = candies.max() ?: -1
        val res = BooleanArray(candies.size, {false})
        
        candies.forEachIndexed {index, candie ->
            res[index] = candie + extraCandies >= maxCandies
        }
        
        return res
    }
}
