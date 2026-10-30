class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
         var map = mutableMapOf<String,MutableList<String>>()
         for(str in strs){
            var bucket = CharArray(26)
            for(c in str){
                bucket[c-'a']++
            }
            var key = bucket.joinToString("#")
            map.getOrPut(key){ mutableListOf() }.add(str)
         }
         return map.values.toList()
    }
}