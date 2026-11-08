class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        var r = 0
        var l = 0
        var deque = ArrayDeque<Int>(nums.size) //index
        var res = IntArray(nums.size - k + 1)
        for(r in nums.indices){
            while(deque.isNotEmpty() && nums[deque.first()] < nums[r]){
                deque.removeFirst()
            }
            deque.addFirst(r)
            if(r >= k-1){
                res[l] = nums[deque.last()]
                if(deque.last() == l){
                    deque.removeLast()
                }
                l++
            }
        }
        return res
    }
}
