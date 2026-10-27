class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var maps = HashMap<Int,Boolean>()
        for(num in nums){
            if(maps.contains(num)){
                return true
            }
            maps.put(num,true)
        }
        return false
    }
}
