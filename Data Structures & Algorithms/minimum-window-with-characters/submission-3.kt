class Solution {
    fun minWindow(s: String, t: String): String {
        if(s.length < t.length) return ""
        var mapt = mutableMapOf<Char,Int>()
        var maps = mutableMapOf<Char,Int>()

        for(c in t){
            mapt[c] = mapt.getOrDefault(c,0)+1
        }

        var i = 0
        var j = 0
        var have = 0
        var need = mapt.size
        var res = ""
        while(j<s.length){
            var c = s[j]
            maps[c] = maps.getOrDefault(c,0)+1
            if(mapt.contains(c) && mapt.getOrDefault(c,0) == maps.getOrDefault(c,0)){
                have++
            }
            while(have == need){
                var sub = s.substring(i,j+1)
                if(res.length == 0 || sub.length < res.length){
                    res = sub
                }
                var d = s[i]
                maps[d] = maps.getOrDefault(d,0)-1
                if(mapt.contains(d) && mapt.getOrDefault(d,0) > maps.getOrDefault(d,0)){
                    have--
                }
                i++         
            }
            j++
        }
        return res
    }
}
