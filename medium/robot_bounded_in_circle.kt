/*
    1041. Robot Bounded In Circle
    
    https://leetcode.com/problems/robot-bounded-in-circle/
*/

class Solution {
    fun isRobotBounded(instructions: String): Boolean {
        var dx = 0 
        var dy = 1
        var x = 0
        var y = 0
        
        instructions.forEach {instruction -> 
            when (instruction) {
                'G' -> { 
                    x += dx 
                    y += dy
                }
                'L' -> {
                    if (dx == 0) {
                        dx = -dy 
                        dy = 0
                    }
                    else {
                        dy = dx
                        dx = 0
                    }
                }
                'R' -> {
                    if (dx == 0) {
                        dx = dy
                        dy = 0
                    }
                    else {
                        dy = -dx
                        dx = 0
                    }
                }
            }
        }
        return x == 0 && y == 0 || 
               dy == -1 ||        
               dx != 0
    }
}
