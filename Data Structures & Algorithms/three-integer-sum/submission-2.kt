class Solution {
    fun threeSum(numbers: IntArray): List<List<Int>> {
        var nums = numbers.sorted()
        var result = mutableListOf<List<Int>>()
        for(i in nums.indices){
            if(nums[i] > 0)
                break
            if(i> 0 && nums[i] == nums[i-1])
                continue
            var j = i+1
            var k = nums.size-1
            while(j<k){
                val sum = nums[i] + nums[j] + nums[k]
                if(sum < 0){
                    j++
                }else if (sum > 0){
                    k--
                }else{
                    result.add(listOf(nums[i],nums[j],nums[k]))
                    j++
                    k--
                    while(j<k && nums[j] == nums[j-1]){
                        j++
                    }
                }
            }
        }
        return result
    }
}
