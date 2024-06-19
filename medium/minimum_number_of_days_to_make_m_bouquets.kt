/*
  1482. Minimum Number of Days to Make m Bouquets
  https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
*/

class Solution {
    fun countBouquets(bloomDay: IntArray, day: Int, k: Int) : Int {
        var cnt = 0
        var bouquets = 0
        for (bday in bloomDay) {
            if (bday <= day) cnt++
            else cnt = 0
            if (cnt == k) {
                bouquets++
                cnt = 0
            }
        }
        return bouquets
    }
    
    fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        var start = 0
        var end = bloomDay.max()
        var res = -1
        while (start <= end) {
            var mid = (start + end) / 2
            if (countBouquets(bloomDay, mid, k) >= m) {
                res = mid
                end = mid - 1
            }
            else
                start = mid + 1
        }
        return res
    }
}
