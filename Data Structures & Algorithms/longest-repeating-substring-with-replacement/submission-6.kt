class Solution {
    fun characterReplacement(s: String, k: Int): Int {
       var map = mutableMapOf<Char,Int>()
       var i = 0 
       var j = 0
       var max = 0
       var res = 0
       while(j < s.length){
            var l = s[i]
            var r = s[j]
            map[r] = map.getOrDefault(r,0) + 1
            max = maxOf(map.getOrDefault(r,0),max)
            while(j-i+1 - max > k){
                map[l] = map.getOrDefault(l,0)-1
                i++
            }
            res = maxOf(res,j-i+1)
            j++
       }
       return res
    }
}
