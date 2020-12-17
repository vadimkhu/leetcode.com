/*
  24. Swap Nodes in Pairs
  https://leetcode.com/problems/swap-nodes-in-pairs/submissions/
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
    fun swapNodes(prev: ListNode?, curr: ListNode?): ListNode? {
        if (curr == null) return null
        if (curr?.next == null) return curr
        
        var cur = curr
        var pre = prev
        var temp = curr
        var next = curr?.next
        cur = next;
        next = temp;
        temp = cur?.next;
        if (cur != null) cur.next = next;
        if (next != null) next.next = temp;
        if (pre != null && pre != next)
            pre.next = cur;
        swapNodes(next, next.next);
        return cur;        
    }
    
    fun swapPairs(head: ListNode?): ListNode? {
        return swapNodes(head, head)
    }
}
