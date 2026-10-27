class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        var maps = mutableMapOf<Char,Int>()
        var mapt = mutableMapOf<Char,Int>()
        var length = if(s.length>t.length) s.length else t.length
        for(i in 0..length){
            if(i<s.length){
                maps[s[i]] = maps.getOrDefault(s[i],0)+1
            }
            if(i<t.length){
                mapt[t[i]] = mapt.getOrDefault(t[i],0)+1
            }
        }
        for((key,value) in maps){
            if(value != mapt.getOrDefault(key,0)){
                return false 
            }
        }
        return true
    }
}
