class Solution {
    fun minWindow(s: String, t: String): String {
       if(s.length < t.length) return ""

       var maps = mutableMapOf<Char,Int>()
       var mapt = mutableMapOf<Char,Int>()

       for(c in t){
            mapt[c] = mapt.getOrDefault(c,0)+1
       }

       var have = 0
       var need = mapt.size
       var i=0
       var j=0
       var result = ""
       while(j<s.length){
            var c = s[j]
            maps[c] = maps.getOrDefault(c,0)+1

            if(mapt.getOrDefault(c,0) == maps.getOrDefault(c,0)){
                have++
            }

            while(have == need){
                if(result.isEmpty() || j-i+1 < result.length){
                    result = s.substring(i,j+1)
                }
                var ch = s[i]
                maps[ch] = maps.getOrDefault(ch,0)-1
                if(mapt.contains(ch) && maps.getOrDefault(ch,0) < mapt.getOrDefault(ch,0)){
                    have--
                }
                i++
            }
            j++
       }
       return result
    }
}
