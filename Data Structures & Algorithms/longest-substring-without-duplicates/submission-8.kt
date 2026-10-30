class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var cset = mutableSetOf<Char>()
        var max = 0
        var l = 0
        var r = 0
        while(r<s.length){
            var c =s[r]
            if(cset.contains(c)){
                while(cset.contains(c)){
                    cset.remove(s[l])
                    l++
                }
            }
            cset.add(c)
            max = maxOf(max,r-l+1)
            r++
        }
        return max
    }   
}
