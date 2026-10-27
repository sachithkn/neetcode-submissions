class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String,MutableList<String>>()
        for(str in strs){
            val sort = str.toCharArray().sorted().joinToString("")
            map.getOrPut(sort){
                mutableListOf()
            }.add(str)
        }
        return map.values.toList()
    }

}
