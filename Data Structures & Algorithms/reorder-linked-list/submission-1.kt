/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        var list = mutableListOf<ListNode>()
        var cur = head
        while(cur != null){
            list.add(cur)
            cur = cur.next
        }

        var l = 0
        var r = list.size - 1
        while(l<r){
            list[l].next = list[r]
            l++
            if(l >= r){
                break
            }
            list[r].next = list[l]
            r--
        }
        list[l].next = null
    }
}
