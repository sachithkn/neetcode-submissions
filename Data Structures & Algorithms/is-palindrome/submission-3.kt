class Solution {
    fun isPalindrome(s: String): Boolean {
        var ignore = listOf<Char>(' ','?','`','~','!','@','#','\'','%','^','&','*','(',')','_','-','+','=','{','}',':',',','.')
        var i =0
        var j =s.length-1
        while(i>=0 && i<s.length){
            if(ignore.contains(s[i])){
                i++
            }else if(ignore.contains(s[j])){
                j--
            }else if(s[i].lowercaseChar() == s[j].lowercaseChar()){
                i++
                j--
            }else{
                return false
            }
        }
        return true
    }
}
