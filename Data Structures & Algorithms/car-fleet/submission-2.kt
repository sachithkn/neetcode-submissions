class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
       var combined = position.zip(speed).sortedByDescending{it.first}
       var res = 0
       var last = -1.0
       //0,1 1,2 4,2 7,1
       //3, 3, 4.5 
       for(car in combined){
            var time = (target - car.first).toDouble()/car.second.toDouble()
            if(last == -1.0 || last < time){
                res++
                last = time
            }
       }
        return res
    }
}
