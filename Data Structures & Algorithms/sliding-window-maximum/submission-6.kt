class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        var l = 0
        var r = 0
        val queue =ArrayDeque<Int>()
        val result = IntArray(nums.size-k+1)
        while(r<nums.size){
            while (queue.isNotEmpty() && nums[queue.last()] < nums[r]) {
                queue.removeLast()
            }
            queue.addLast(r)

            if(queue.first() < l){
                queue.removeFirst()
            }

            if(r >= k -1 ){
                result[l] = nums[queue.first()]
                l++
            }
            r++

        }
        return result
    }
}
