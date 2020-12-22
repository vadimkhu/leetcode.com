class Solution {
  fun walk(s: String, index: Int, words: List<String>, visited: Array<Boolean>): Boolean {
    if (index >= s.length) return true
    if (visited[index]) return false
    
    for (w in words) {
      if (s.indexOf(w, index) == index) {
        if (walk(s, index + w.length, words, visited)) return true
      }
    }
        
    visited[index] = true;
    return false;  
  }
    
  fun wordBreak(s: String, wordDict: List<String>): Boolean {
    var visited: Array<Boolean> = Array<Boolean>(s.length) { false }
    return walk(s, 0, wordDict, visited)
  }
}
