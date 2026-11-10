class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
       var joined = position.zip(speed).sortedByDescending{it.first}

       var result = 0
       var last = 0.0
       for(car in joined){
            var pos = car.first
            var speed = car.second
            //4,1,0,7
            //2,2,1,1
            //0,1,4,7
            //1,2,2,1
            //10,4.5,3,3
            //3,3,4.5,10
            var time = (target - pos).toDouble()/speed
            if(last < time){
                last = time
                result++
            }
       }
       return result
    }
}
