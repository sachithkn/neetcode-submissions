class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int,Boolean>()
        for(num in nums){
            if(map[num] == true) return true
            map[num] = true
        }
        return false
    }
}
