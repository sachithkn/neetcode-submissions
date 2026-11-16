class Solution {
    fun maxArea(heights: IntArray): Int {
     var l = 0
     var r = heights.size - 1
     var res = 0
     while(l<r){
        if(heights[l] < heights[r]){
            val area = (r-l) * heights[l]
            res = maxOf(res,area)
            l++
        }else{
            val area = (r-l) * heights[r]
            res = maxOf(res,area)
            r--
        }
     }
     return res
    }
}