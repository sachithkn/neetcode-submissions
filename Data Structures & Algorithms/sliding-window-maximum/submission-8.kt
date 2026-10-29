class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        var l = 0
        var r = 0
        var q = ArrayDeque<Int>()
        var result = IntArray(nums.size-k+1)

        while(r<nums.size){
            while(q.isNotEmpty() && nums[q.last()] < nums[r]){
                q.removeLast()
            }

            q.addLast(r)

            if(q.first() < l){
                q.removeFirst()
            }

            if(r >= k-1){
                result[l] = nums[q.first()]
                l++
            }
            r++
        }
        return result
    }
}
