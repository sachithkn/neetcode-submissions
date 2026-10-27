class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int,Int>()
        for(i in numbers.indices){
            if(map.contains(numbers[i])){
                return intArrayOf(map[numbers[i]]!!+1,i+1)
            }
            map.put(target-numbers[i],i)
        }
        return intArrayOf()
    }
}
