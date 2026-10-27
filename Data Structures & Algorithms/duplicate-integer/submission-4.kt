class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var list = mutableListOf<Int>()
        for(num in nums){
            if(list.contains(num)){
                return true
            }
            list.add(num)
        }
        return false
    }
}
