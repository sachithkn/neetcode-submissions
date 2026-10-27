class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        val smap = HashMap<Char,Int>()
        val tmap = HashMap<Char,Int>()
        var i = 0
        while(i< s.length || i<t.length){
            if(i<s.length){
                val sc = s[i]
                if(smap.contains(sc)){
                    smap[sc] = smap[sc]!! + 1
                }else{
                    smap[sc] = 1
                }
            }
            if(i < t.length){
                val tc = t[i]
                if(tmap.contains(tc)){
                    tmap[tc] = tmap[tc]!! + 1
                }else{
                    tmap[tc] = 1
                }
            }
            i++
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
