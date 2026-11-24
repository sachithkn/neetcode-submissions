/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(node1: ListNode?, node2: ListNode?): ListNode? {
        var list1 = node1
        var list2 = node2
        var last:ListNode? = ListNode(0)
        var res:ListNode? = last
        while(list1 != null && list2 != null){
            if(list1.`val` < list2.`val`){
                res?.next = list1
                list1 = list1.next
            }else{
                res?.next = list2
                list2 = list2.next
            }
            res = res?.next
        }
        while(list1 != null){
            res?.next = list1
            list1 = list1.next
            res = res?.next
        }
        while(list2 != null){
            res?.next = list2
            list2 = list2.next
            res = res?.next
        }
        return last?.next
    }
}
