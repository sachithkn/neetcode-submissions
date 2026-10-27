class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            if(map.contains(nums[i])){
                return intArrayOf(map.getOrDefault(nums[i],0),i)
            }
            map[target-nums[i]] = i
        }
        return intArrayOf()
    }
}
