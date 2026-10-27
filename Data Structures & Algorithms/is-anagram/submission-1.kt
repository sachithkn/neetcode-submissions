class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        var ss:List<Char> = s.toCharArray().sorted()
        var st:List<Char> = t.toCharArray().sorted()
        return ss.equals(st)
        val smap = HashMap<Char,Int>()
        for(c in s){
            if(smap.contains(c)){
                smap[c] = smap[c]!! + 1
            }else{
                smap[c] = 1
            }
        }
        val tmap = HashMap<Char,Int>()
        for(c in t){
            if(tmap.contains(c)){
                tmap[c] = tmap[c]!! + 1
            }else{
                tmap[c] = 1
            }
        }
        if(smap.size != tmap.size)
            return false
        for((key,value) in smap){
            if(smap[key] != tmap[key]){
                return false
            }
        }
        return true
    }
}
