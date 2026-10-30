class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var result = IntArray(2)
        var l = 0
        var r = numbers.size-1
        while(l<r){
            var sum = numbers[l] + numbers[r]
            if(sum<target){
                l++
            }else if(sum > target){
                r--
            }else{
                return intArrayOf(l+1,r+1)
            }
        }
        return intArrayOf()
    }
}
