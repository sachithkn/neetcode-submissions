class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            val num = nums[i]
            if(map[num] != null){
                return intArrayOf(map[num] ?: 0,i)
            }
            map[target-num] = i
        }
        return intArrayOf()
    }
}
