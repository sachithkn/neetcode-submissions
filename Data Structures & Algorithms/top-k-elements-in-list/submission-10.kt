  class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray { 
      var map = mutableMapOf<Int,Int>()  
      for(num in nums){
        map[num] = map.getOrDefault(num,0) + 1
      }
      var bucket = Array<MutableList<Int>>(nums.size+1){ mutableListOf<Int>() }
      for((key,value) in map){
        bucket[value].add(key)
      }

      var i = 0
      var result = IntArray(k)
      for(j in bucket.size-1 downTo 0){
        if(bucket[j].isNotEmpty()){
            for(num in bucket[j]){
                result[i] = num
                i++
                if(i == k){
                    return result
                } 
            }
        }
      }
      return result      
    }
}
