class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val queue= ArrayDeque<IntArray>()
        val res = IntArray(temperatures.size)

        for(i in temperatures.indices){
            val temp = temperatures[i]
            while(queue.isNotEmpty() && queue.peekFirst()[1] < temp){
                val last = queue.first()
                res[last[0]] = i - last[0]
                queue.removeFirst()
            }
            queue.addFirst(intArrayOf(i,temp))           
        }
        while(queue.isNotEmpty()){
            val last = queue.first()
            res[last[0]] = 0
            queue.removeFirst()
        }
        return res
    }
}
