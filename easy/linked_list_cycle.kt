/*
  141. Linked List Cycle
  
  https://leetcode.com/problems/linked-list-cycle/
*/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) return false
        
        var cur1: ListNode? = head
        var cur2: ListNode? = head.next
    
        while (cur1 != null && cur2 != null && cur1 != cur2) {
            cur1 = cur1.next
            if (cur2.next != null)
                cur2 = cur2.next.next
            else
                cur2 = null
        }
        if (cur1 == null) return false
        if (cur2 == null) return false
        return cur1 == cur2
    }
}
