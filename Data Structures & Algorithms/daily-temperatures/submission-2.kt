class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        var result = IntArray(temperatures.size)
        var stack = Stack<Int>() // indeces
        for(i in temperatures.indices){
            while(stack.isNotEmpty() && temperatures[stack.peek()] < temperatures[i]){
                result[stack.peek()] = i - stack.peek() 
                stack.pop()
            }
            stack.push(i)
        }

        return result           
    }
}
