class Solution {
    fun trap(height: IntArray): Int {
        var l = 0 
        var r = height.size - 1
        var maxL = 0
        var maxR = 0
        var res = 0
        while(l<r){
            if(height[l] < height[r]){
                if(maxL > height[l]){
                    res += maxL - height[l] 
                }
                maxL = maxOf(maxL,height[l])
                l++
            }else{
                if(maxR > height[r]){
                    res += maxR - height[r]
                }
                maxR = maxOf(maxR,height[r])
                r--
            }
        }
        return res
    }
}
