class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {  
      val map = mutableMapOf<Int,Int>()
      for(num in nums){
        map[num] = map.getOrDefault(num,0) + 1
      }

      val bucket = Array<MutableList<Int>>(nums.size+1){mutableListOf()}
      for((key,value) in map){
        bucket[value].add(key)
      }

      val result = IntArray(k)
      var count = 0
      for(i in bucket.size - 1 downTo 0){
        for(key in bucket[i]){
          result[count++] = key
          if(count == k){
            return result
          }
        }
      }
      return result
    }
}
