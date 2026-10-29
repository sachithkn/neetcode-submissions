class Solution {
    fun trap(height: IntArray): Int {
        var l = 0
        var r = height.size-1
        var leftMax = 0
        var rightMax = 0
        var result = 0
        while(l<=r){
            var diff = 0
            if(height[l] < height[r]){
                leftMax = maxOf(height[l],leftMax)
                diff = leftMax - height[l]
                l++
            }else{
                rightMax = maxOf(height[r],rightMax)
                diff = rightMax - height[r]
                r--                
            }
            if(diff>0){
                result += diff
            }
        }
        return result
    }
}
