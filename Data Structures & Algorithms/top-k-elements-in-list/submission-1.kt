class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var map = sortedMapOf<Int,Int>()
        for(num in nums){
            if(map.contains(num)){
                map.set(num,map[num]!!+1)
            }else{
                map.set(num,1)
            }
        }
        var array = Array(nums.size+1){ mutableListOf<Int>() }
        for((key,value) in map){
            array[value].add(key)
        }
        val result = IntArray(k)
        var rindex = 0
        var aindex = array.size - 1
        while(aindex < array.size && aindex>=0){
            val list = array[aindex]
            if(list.isNotEmpty()) {
                for(a in list){
                    if(rindex<k){
                        result[rindex] = a                
                        rindex++
                    }else{
                        return result
                    }
                }
            }
            aindex--
        }
        return result
    }
}
