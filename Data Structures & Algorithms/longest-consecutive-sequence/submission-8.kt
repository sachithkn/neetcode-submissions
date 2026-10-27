class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        //hashset [2,20,4,10,3,5]
        val hashset = nums.toHashSet()

        var result = 0
        for(num in hashset){
            if(!hashset.contains(num-1)){
                var count = 1              
                while(hashset.contains(num+count)){
                    count++
                }
                result = Math.max(result,count)
            }
        }
        return result
    }
}
