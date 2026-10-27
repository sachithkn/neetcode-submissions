class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        val sorted = nums.sorted()
        var result = 0
        var count = 1
        //[9,1,4,7,3,-1,0,5,8,-1,6]
        //[-1,-1,0,1,3,4,5,6,7,8,9]
        for(i in 1 until sorted.size){
            if(sorted[i]-1 == sorted[i-1]){
                count++
            }else if(sorted[i] != sorted[i-1]){
                count = 1
            }
            if(count>result){
                result = count 
            }
        }
        if(count>result){
            result = count 
        }
        return result       
    }
}
