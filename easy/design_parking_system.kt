/*
  1603. Design Parking System
  
  https://leetcode.com/problems/design-parking-system/
*/

class ParkingSystem(var big: Int, var medium: Int, var small: Int) {
    fun addCar(carType: Int): Boolean = 
        when (carType) {
            1 -> big-- > 0
            2 -> medium-- > 0
            3 -> small-- > 0
            else -> false
        }
}
