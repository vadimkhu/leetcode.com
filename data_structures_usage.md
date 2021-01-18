## Some notes on using Data Structures in Kotlin with examples

### 1. IntArray conversion

```kotlin
var temporary = mutableListOf<Int>()
... 
// populate with 'add' function
...
val answer = temporary.toIntArray()
```

### 2. HashMap usage

medium/group_anagrams.kt

### 3. Using 'when' for returning a value from a function

```kotlin
class ParkingSystem(var big: Int, var medium: Int, var small: Int) {
    fun addCar(carType: Int): Boolean = 
        when (carType) {
            1 -> big-- > 0
            2 -> medium-- > 0
            3 -> small-- > 0
            else -> false
        }
}
```

### 4. IntArray initialization

```kotlin
val dp: IntArray = IntArray(nums.size) { 1 }
```

### 5. max()

```kotlin
res = Math.max(res, dp[i])
```
