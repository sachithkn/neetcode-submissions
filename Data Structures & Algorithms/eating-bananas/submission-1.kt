class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var max = 0
        for(pi in piles){
            max = maxOf(pi,max)
        }

        var s = 1
        var e = max
        var mink = max
        while(s<=e){
            var mid = s+((e-s)/2)
            var hour = 0L
            for(pi in piles){
                hour += pi/mid
                if(pi%mid>0)
                    hour++
            }
            if(hour<=h){
                mink = mid
                e = mid-1
            }else{
                s = mid+1
            }
        }
        return mink
    }
}
