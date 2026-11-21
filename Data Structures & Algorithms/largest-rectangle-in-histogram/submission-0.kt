class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        var i = 0 
        var j = 0
        var res = 0
        var stack = Stack<IntArray>()
        for(i in heights.indices){
            var height = heights[i]
            var start = i
            while(stack.isNotEmpty() && stack.peek()[1] > height){
                val last = stack.pop()
                var area = (i - last[0]) * last[1]
                res = maxOf(area,res) 
                start = last[0]
            }
            stack.push(intArrayOf(start,height))        
        }
        while(stack.isNotEmpty()){
            val last = stack.pop()
            val area = (heights.size - last[0]) * last[1]
            res = maxOf(area,res)
        }
        return res
    }
}
