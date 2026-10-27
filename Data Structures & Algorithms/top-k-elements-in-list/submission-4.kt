class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {  
        val map = mutableMapOf<Int,Int>()
        for(num in nums){
            map[num] = map.getOrPut(num){ 0 } + 1
        }
        val sortedMap = map.toList().sortedByDescending{(key,value) -> value }.toMap()
        print(sortedMap)
        return sortedMap.keys.toList().take(k).toIntArray()
        
    }
}
