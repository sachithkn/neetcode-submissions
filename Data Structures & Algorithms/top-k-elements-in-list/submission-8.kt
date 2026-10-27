  class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray { 
      var map = mutableMapOf<Int,Int>()
      for(num in nums){
        map[num] = map.getOrDefault(num,0)+1
      }

      val array = Array<MutableList<Int>>(nums.size+1){ mutableListOf()}
      for((key,value) in map){
        array[value].add(key)
      }

      val result = IntArray(k)
      var count = 0
      for(i in array.size-1 downTo 0){
        for(item in array[i]){
          result[count++] = item
          if(count == k){
            return result
          }
        }
      }
      return result   
    }
}
