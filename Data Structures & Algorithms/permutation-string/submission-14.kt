class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        var array1 = IntArray(26)
        var array2 = IntArray(26)

        for(i in s1.indices){
            array1[s1[i]-'a']++
        }
        for(i in s2.indices){
            array2[s2[i]-'a']++

            if(i>=s1.length){
                var charToRemove = s2[i-s1.length]
                array2[charToRemove-'a']--
            }
            if(i>=s1.length-1 && array1.contentEquals(array2)){
                return true
            }
        }
        return false
    }
}
