class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
       var i = 0
       var j = 0
       var map = mutableMapOf<Char,Int>()
       var res = 0
       while(j<s.length){
        if(map.contains(s[j])){
            i = maxOf(map[s[j]]!!+1,i)
        }
        map[s[j]!!] = j
        res = maxOf(j-i+1,res)
        j++
       }
        return res
    }

}
