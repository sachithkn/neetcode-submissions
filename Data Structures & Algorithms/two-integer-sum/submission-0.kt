class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()
        for(i in nums.indices){
            if(map.contains(nums[i])){
                return intArrayOf(map[nums[i]]!!,i)
            }
            map[target-nums[i]] = i
        }
        return intArrayOf()
    }
}
