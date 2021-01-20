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

### 6. Find maximum sum in a two-dimensional array

The next piece of code:
```kotlin
// Runtime: 164 ms, Memory Usage: 36.1 MB
class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max: Int = 0
        for (account in accounts) {
            val sum: Int = account.sum()
            max = Math.max(max, sum)
        }
        return max
    }
}
```
can be converted to the one-line solution:
```kotlin
// Runtime: 188 ms, Memory Usage: 37 MB
class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        return accounts.map { it->sum() }.max() ?: 0
    }
}
```

### 7. Using indices in forEach loop

```kotlin
class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
        var arr = IntArray(encoded.size + 1) { 0 }
        arr.indices.forEach { arr[it] = if (it == 0) first else arr[it-1] xor encoded[it-1]}
        return arr
    }
}
```

### 8. Boolean Array

```kotlin
    var dp: BooleanArray = BooleanArray(s.length) 
```
