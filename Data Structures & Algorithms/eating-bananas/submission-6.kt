class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
       var max = piles.max()

       var l = 1
       var r = max
       var res = Int.MAX_VALUE
       while(l<=r){
            var mid = l + ((r-l)/2)
            var hour = 0L
            for(pi in piles){
                hour += pi/mid
                if(pi%mid > 0){
                    hour++
                }
            }
            if(hour<=h){
                res = minOf(res,mid)                
                r = mid-1
            }else{
                l = mid+1
            }
       }
       return res
    }
}
