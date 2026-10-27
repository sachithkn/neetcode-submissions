class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String,MutableList<String>>()
        for(str in strs){
            val sortedStr = str.toCharArray().sorted().toString()
            map.getOrPut(sortedStr){
                mutableListOf()
            }.add(str)
        }
        return map.values.toList()
    }

}
