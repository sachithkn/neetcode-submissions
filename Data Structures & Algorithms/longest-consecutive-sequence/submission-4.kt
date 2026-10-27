class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        var map = mutableMapOf<Int,Int>()
        var result = 0
        for(num in nums){
            if(map[num] == null){
                map[num] = map.getOrDefault(num+1,0) + map.getOrDefault(num-1,0) + 1
                map[num - map.getOrDefault(num-1,0)] = map.getOrDefault(num,0)
                map[num + map.getOrDefault(num+1,0)] = map.getOrDefault(num,0)
                if(result<map.getOrDefault(num,0)){
                    result =map.getOrDefault(num,0)
                }
            }
        }    
        return result
    }
}
