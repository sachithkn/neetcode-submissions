  class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray { 
        
        var map = mutableMapOf<Int,Int>()
        for(num in nums){
            map[num] = map.getOrDefault(num,0)+1
        }

        var array = Array<MutableList<Int>>(nums.size+1){ mutableListOf() }
        for((key,value) in map){
            array[value].add(key)
        }

        var res = IntArray(k)
        var j = 0
        for(i in array.size-1 downTo 0){
            var list = array[i]
            if(j>=k){
                return res
            }
            for(item in list){
                res[j] = item
                j++
            }
        }
        return res
    }
}
