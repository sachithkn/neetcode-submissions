class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        var map = mutableMapOf<Char,Int>()
        var map2 = mutableMapOf<Char,Int>()
        for(i in s.indices){
            map[s[i]] = (map[s[i]] ?: 0) + 1
            map2[t[i]] = (map2[t[i]] ?: 0) + 1
        }
        if(map.entries.size != map2.entries.size)
            return false
        for((key,value) in map){
            if(value != map2[key]){
                return false
            }
        }
        return true
    }
}
