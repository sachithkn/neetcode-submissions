/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        val list = mutableListOf<ListNode>()
        var cur = head
        while(cur != null){
            if(list.contains(cur)){
                return true
            }
            list.add(cur)
            cur = cur.next
        } 
        return false
    }
}
