class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
         var map = mutableMapOf<String,MutableList<String>>()
       for(str in strs){
            var freqArray = IntArray(26)
            for(c in str){
                freqArray[c-'a']++
            }
            var freq = freqArray.joinToString("#")
            map.getOrPut(freq){
                mutableListOf()
            }.add(str)
       }
       return map.values.toList()
    }

}
