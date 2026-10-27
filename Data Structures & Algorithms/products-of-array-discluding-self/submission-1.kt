class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size){0}
        var totalProd = 1
        var numIndex = -1
        var numzeros = 0 
        for(num in nums){
            totalProd *= num
            if(num == 0){
                numIndex = nums.indexOf(num)
                numzeros++
            }
        }
        if(numzeros>1){
            return result
        }else if(numzeros == 1){
            var prod = 1
            for(i in nums.indices){
                if(i != numIndex){
                    prod *= nums[i]
                }
            }
            result[numIndex] = prod
            return result
        }else{
            for(i in nums.indices){
                result[i] = totalProd/nums[i]
            }
        }

        return result
    }
}
