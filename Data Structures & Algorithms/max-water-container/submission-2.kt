class Solution {
    fun maxArea(heights: IntArray): Int {
       var l = 0
       var r = heights.size-1
       var res = Int.MIN_VALUE
       while(l<r){
            var min = minOf(heights[l],heights[r])
            res = maxOf(res,min*(r-l))
            if(heights[l]<heights[r]){
                l++
            }else{
                r--
            }
       }
       return res
    }
}