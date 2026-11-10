class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var map = mutableMapOf<Int,Int>()
        for(i in numbers.indices){
            val num = numbers[i]
            if(map.contains(num)){
                return intArrayOf(map.getOrDefault(num,0)+1,i+1)
            }
            map[target-num] = i
        }
        return intArrayOf()
    }
}
