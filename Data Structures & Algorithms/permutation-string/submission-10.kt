class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s2.length<s1.length) return false
        var i = 0
        var j = s1.length
        var map1 = mutableMapOf<Char,Int>()
        var map2 = mutableMapOf<Char,Int>()
        for(k in s1.indices){
            map1[s1[k]] = map1.getOrDefault(s1[k],0)+1
            map2[s2[k]] = map2.getOrDefault(s2[k],0)+1
        }
        while(j<s2.length+1){
            var check = true
            for((key,value) in map1){
                if(value > map2.getOrDefault(key,0)){
                    check = false
                    break
                }
            }
            if(check){
                return true
            }
            if(j<s2.length){
                map2[s2[i]] = map2.getOrDefault(s2[i],0)-1
                map2[s2[j]] = map2.getOrDefault(s2[j],0)+1
            }
            i++
            j++
        }
        return false
    }
}
