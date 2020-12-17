/*
  807. Max Increase to Keep City Skyline
  https://leetcode.com/problems/max-increase-to-keep-city-skyline/
*/

class Solution {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        val n = grid.size;
        val m = grid[0].size;
        var max_r = IntArray(n);
        var max_c = IntArray(m);
        
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] > max_r[i])
                    max_r[i] = grid[i][j];
                if (grid[i][j] > max_c[j])
                    max_c[j] = grid[i][j];
            }
        }
        
        var ans: Int = 0;
        for (i in grid.indices) {
            for (j in grid[0].indices)
                if (grid[i][j] < kotlin.math.min(max_r[i], max_c[j]))
                    ans += kotlin.math.min(max_r[i], max_c[j]) - grid[i][j];
        }
        return ans;        
    }
}
