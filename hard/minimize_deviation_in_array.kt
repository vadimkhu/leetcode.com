/*
  1675. Minimize Deviation in Array
  
  https://leetcode.com/problems/minimize-deviation-in-array/
*/

class Solution {
    class PairComparator: Comparator<Pair<Int, Int>> { 
        override fun compare(lhs: Pair<Int, Int>?, rhs: Pair<Int, Int>?): Int { 
            if (lhs == null || rhs == null) 
                return 0; 
            if (lhs.first < rhs.first) return 1
            if (rhs.first == lhs.first && lhs.second < rhs.second)
                return 1
            return -1
        } 
    }
    
    fun minimumDeviation(nums: IntArray): Int {
        var res: Int = Int.MAX_VALUE
        var xmax: Int = 0
        val comparator = PairComparator()
        var q = PriorityQueue<Pair<Int, Int>>(nums.size, comparator)
        for (num in nums) {
            var x = num
            val y = if (x % 2 != 0) x * 2 else x 
            while (x % 2 == 0) x /= 2
            q.offer(-x to y)
            xmax = Math.max(xmax, x)
        }

        while (true) {
            var (x, y) = q.poll()
            x = -x
            res = Math.min(res, xmax - x)
            if (x < y) {
                q.offer((-x*2) to y)
                xmax = Math.max(xmax, x*2)
            }
            else break     
        }
        
        return res
    }
}
