class Solution {

    fun encode(strs: List<String>): String {
        var result = StringBuffer()
        for(s in strs){
            for(c in s){
                var ci = c.toInt()+1
                result.append(ci.toChar())
            }
            result.append("-,;")
        }
        return result.toString()
    }

    fun decode(str: String): List<String> {
        var result = ArrayList<String>()
        var string = StringBuffer()
        var i = 0
        while(i < str.length){
            val c = str[i]
            if(i<str.length-2 
                    && c=='-'
                    && str[i+1]==','
                    && str[i+2]==';'){
                i += 2
                result.add(string.toString())
                string = StringBuffer()
            }else{
                var ce = c.toInt()-1
                string.append(ce.toChar())
            }
            i++
        }
        return result
    }
}
