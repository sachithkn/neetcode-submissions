class Solution {
    fun maxArea(heights: IntArray): Int {
        var result = 0
        var l =0
        var r = heights.size-1
        while(l<r){
            var min = minOf(heights[l],heights[r])
            var volume = min * (r-l)
            if(result<volume){
                result = volume
            }
            if(heights[l]<heights[r]){
                l++
            }else{
                r--
            }
        }
        return result
    }
}