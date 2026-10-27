class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s2.length < s1.length) return false
        val map1 = mutableMapOf<Char,Int>()
        var map2 = mutableMapOf<Char,Int>()

        for(i in s1.indices){
            map1[s1[i]] = map1.getOrDefault(s1[i],0)+1
        }

        for(i in s2.indices){
            map2[s2[i]] = map2.getOrDefault(s2[i],0)+1

            if(i>=s1.length){
                map2[s2[i-s1.length]] = map2.getOrDefault(s2[i-s1.length],0)-1

                if (map2[s2[i-s1.length]] == 0) {
                    map2.remove(s2[i-s1.length])
                }
            }

            if(i>=s1.length-1 && map1 == map2){
                return true
            }
        }
        return false
    }
}
