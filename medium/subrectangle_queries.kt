/*
  1476. Subrectangle Queries
  https://leetcode.com/problems/subrectangle-queries/
*/

class SubrectangleQueries(var rectangle: Array<IntArray>) {
    
    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        for (r in row1..row2) {
            for (c in col1..col2) {
                rectangle[r][c] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int): Int {
        return rectangle[row][col]
    }

}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * var obj = SubrectangleQueries(rectangle)
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue)
 * var param_2 = obj.getValue(row,col)
 */
