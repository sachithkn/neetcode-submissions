class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var map = mutableMapOf<Int,Boolean>()
        var lon = 0
        for(num in nums){
            map[num] = true
        }
        for((key,value) in map){
            var i = 1
            while(map.contains(key-i)){
                i++
            }
            if(i>lon){
                lon = i
            }
        }
        return lon
    }
}
