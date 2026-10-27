class Solution {
    fun threeSum(num: IntArray): List<List<Int>> {
        var result = mutableListOf<List<Int>>()
        var nums = num.sorted()
        for(i in nums.indices){
            if(nums[i] > 0 ) 
                break
            if(i>0 && nums[i] == nums[i-1])
                continue
            var j =i+1
            var k = nums.size-1
            while(j<k){
                var sum = nums[i] + nums[j] + nums[k]
                if(sum < 0){
                    j++
                }else if(sum > 0){
                    k--
                }else{
                    result.add(listOf<Int>(nums[i],nums[j],nums[k]))
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++
                    }
                }
            }
        }
        return result
    }
}
