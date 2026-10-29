class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        var result = IntArray(temperatures.size)
        for(i in temperatures.indices){
            var temp = temperatures[i]
            var next = i
            while(next<temperatures.size && temperatures[next]<=temp){
                next++
            }
            if(next == temperatures.size){
                result[i] = 0
            }else{
                result[i] = next-i
            }
        }
        return result
    }
}
