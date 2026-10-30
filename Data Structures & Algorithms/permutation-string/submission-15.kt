class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length) return false
       var array1 = IntArray(26)

       for(c in s1){
            array1[c-'a']++
       }

       var array2 = IntArray(26)
        for(i in s2.indices){
            var c = s2[i]
            array2[c-'a']++
            if(i >= s1.length){
                array2[s2[i-s1.length] - 'a']--
            }

            if(i >= s1.length-1){
                if(array1.contentEquals(array2)){
                    return true
                }
            }
        }
        return false
    }
}
