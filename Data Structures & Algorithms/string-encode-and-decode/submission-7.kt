class Solution {
    val delimiter = "1-!@a"
    val empty = "@%3f4"

    fun encode(strs: List<String>): String {
        var result = StringBuilder()
        for(i in strs.indices){
            if(strs[i].isEmpty()){
                result.append(empty)
            }else{
                result.append(strs[i])                
            }
            if(i<strs.size-1)
                result.append(delimiter)
        }
        return result.toString()
    }

    fun decode(str: String): List<String> {        
        if(str == delimiter) return mutableListOf("")
        if(str.isEmpty()) return mutableListOf()
        var result = mutableListOf<String>()
        var array = str.split(delimiter)
        for(i in array.indices){
            if(array[i] == empty){
                result.add("")
            }else{
                result.add(array[i])
            }
        }
        return result
    }
}
