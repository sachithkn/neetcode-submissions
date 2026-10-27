class Solution {
    
    fun encode(strs: List<String>): String {
      var enStr = StringBuilder()
      for(str in strs){
        enStr.append(str.length)
        enStr.append("#")
        enStr.append(str)
      }
      return enStr.toString()
    }

    fun decode(str: String): List<String> {        
        var list = mutableListOf<String>()
        var i = 0
        while(i<str.length){
            var j = i
            while(str[j] != '#'){
                j++
            }
            var length = str.substring(i,j).toInt()
            j++
            i = j+ length
            list.add(str.substring(j,i))
        }
        return list
    }
}
