class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String,MutableList<String>>()
        for(str in strs){
            val count = IntArray(26)
            for(c in str){
                count[c-'a']++
            }
            val freq = count.joinToString("#")
            map.getOrPut(freq){
                mutableListOf()
            }.add(str)
        }
        return map.values.toList()
    }

}
