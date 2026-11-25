  class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray { 
       var map = mutableMapOf<Int,Int>()
       for(num in nums){
            map[num] = map.getOrDefault(num,0)+1
       }

       var bucket = Array<MutableList<Int>>(nums.size+1){ mutableListOf() }
       for((key,freq) in map){
            bucket[freq].add(key)
       }

       var res = IntArray(k)
       var i = 0
       for(j in bucket.size - 1 downTo 0){
            var list = bucket[j]
            for(item in list){
                if(i==k){
                    return res
                }
                res[i++] = item
            }
       }
       return res
    }
}
