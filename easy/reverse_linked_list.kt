/*
  206. Reverse Linked List

  https://leetcode.com/problems/reverse-linked-list
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
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null || head?.next == null) return head
        
        var prev: ListNode? = null
        var curr: ListNode? = head
        var next: ListNode? = head?.next
        
        do {
            var nnext: ListNode? = next?.next
            curr!!.next = prev
            next!!.next = curr
            
            prev = curr
            curr = next
            next = nnext
        } while (nnext != null)
        return curr
    }
}
