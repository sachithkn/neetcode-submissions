/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var result:ListNode? = null
        var cur = head
        while(cur != null){
            val node = ListNode(cur.`val`)
            node.next = result
            result = node
            cur = cur.next
        }
        return result   
    }
}
