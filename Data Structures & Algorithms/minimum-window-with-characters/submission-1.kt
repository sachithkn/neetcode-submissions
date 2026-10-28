class Solution {
    fun minWindow(s: String, t: String): String {
        if(t.length>s.length) return ""

        var maps = mutableMapOf<Char,Int>()
        var mapt = mutableMapOf<Char,Int>()

        for(c in t){            
            mapt[c] = mapt.getOrDefault(c,0)+1
        }

        var need = mapt.size
        var have = 0
        var i = 0
        var j = 0
        var shortest = ""
        while(j < s.length){
            var c = s[j]
            maps[c] = maps.getOrDefault(c,0)+1
            if(mapt.getOrDefault(c,0) == maps.getOrDefault(c,0)){
                have++
            }
            while(have == need){
                if(shortest.isEmpty() || j-i+1 < shortest.length){
                    shortest = s.substring(i,j+1)
                }
                maps[s[i]] = maps.getOrDefault(s[i],0)-1
                if(mapt.contains(s[i]) && maps.getOrDefault(s[i],0) < mapt.getOrDefault(s[i],0)){
                    have--
                }
                i++
            }
            j++
        }

        return shortest
    }
}
