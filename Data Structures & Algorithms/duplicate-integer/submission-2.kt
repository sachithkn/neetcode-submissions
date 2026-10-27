class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var map = mutableSetOf<Int>()
        for(num in nums){
            if(map.contains(num)) return true
            map.add(num)
        }
        return false
    }
}
