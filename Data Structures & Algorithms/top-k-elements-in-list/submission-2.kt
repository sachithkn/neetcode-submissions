class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var map = mutableMapOf<Int,Int>()
        for(num in nums){
            if(map.contains(num)){
                map.set(num,map.get(num)!!+1)
            }else{
                map.set(num,1)
            }
        }

        var array = Array(nums.size+1){ mutableListOf<Int>() }
        for((key,value) in map){
            array[value].add(key)
        }

        var index = array.size - 1
        var resIndex = 0
        var result = IntArray(k)
        while(index >= 0){
            if(resIndex<k){
                val list = array[index]
                for(l in list){
                    result[resIndex] = l
                    resIndex++
                    if(resIndex==k){
                        return result
                    }
                }
                index--
            }else{
                break
            }
        }
        return result
    }
}
