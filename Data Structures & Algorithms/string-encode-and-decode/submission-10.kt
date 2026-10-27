class Solution {

    val divider = '#'
    
    fun encode(strs: List<String>): String {
      var result = StringBuilder()
      for(str in strs){
        val length = str.length
        result.append(length)
        result.append(divider)
        result.append(str)
      }
      return result.toString()
    }

    fun decode(str: String): List<String> {        
        var result = mutableListOf<String>()
        var i = 0
        var prev = 0
        //5#Hello5#World
        while(i<str.length){
            val c = str[i]
            if(c == divider){
                val length = str.substring(prev,i).toInt()
                val str = str.substring(i+1,i+1+length)
                result.add(str)
                i += length
                prev = i+1
            }
            i++
        }
        return result        
    }
}
