class Solution {
    
    fun encode(strs: List<String>): String {
        var enStr = StringBuilder()
        for(str in strs){
            val length = str.length
            enStr.append(length)
            enStr.append("#")
            enStr.append(str)
        }
        return enStr.toString()
    }

    fun decode(str: String): List<String> {        
        var result = mutableListOf<String>()
        var i = 0
        while(i<str.length){
            var j = i
            while(str[j] != '#'){
                j++
            }
            val length = str.substring(i,j).toInt()
            j++
            result.add(str.substring(j,j+length))
            i = j + length
        }
        return result
    }
}
