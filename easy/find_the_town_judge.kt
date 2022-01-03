/*
  997. Find the Town Judge
  
  https://leetcode.com/problems/find-the-town-judge/
*/

class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val degree: IntArray = IntArray(n+1) { 0 }
        trust.indices.forEach {
            degree[trust[it][0]]--;
            degree[trust[it][1]]++;
        } 
        for (i in 1 until n + 1) {
            if (degree[i] == n-1) return i
        }
        return -1
    }
}
