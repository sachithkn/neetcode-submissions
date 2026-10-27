class Solution {
    fun maxArea(heights: IntArray): Int {
        var result = 0
        var i=0
        var j=heights.size-1
        while(i<j){
            val water = (j-i) * minOf(heights[i],heights[j])
            if(result<water){
                result = water
            }
            if(heights[i]<heights[j]){
                i++
            }else{
                j--
            }
            
        }
        return result

    }
}
