class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.length < 2) return s.length
        var i = 0 
        var j = 0
        var res = 0
        var map = mutableMapOf<Char,Int>()
        while(i< s.length){
            if(map.contains(s[i])){
                j = maxOf(map[s[i]]!!+1,j)
            }
            map[s[i]] = i
            res = maxOf(res,i-j+1)
            i++
        }
        return res
    }

}
