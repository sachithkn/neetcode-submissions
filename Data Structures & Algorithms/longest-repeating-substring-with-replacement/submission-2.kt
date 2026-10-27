class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var map = mutableMapOf<Char,Int>()
        var i = 0
        var j = 0
        var res = 0
        var max = 0
        while(j < s.length){
            var c = s[j]
            map[c] = map.getOrDefault(c,0)+1
            max = maxOf(max,map[c]!!)
            while((j-i+1) - max > k){
                map[s[i]] = map[s[i]]!! - 1 
                i++
            }
            res = maxOf(j-i+1,res)
            j++
        }
        return res
    }
}
