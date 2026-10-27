class Solution {
    fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length-1
        while(i<j){
            if(!s[i].isLetter() && !s[i].isDigit()){
                i++
            }else if(!s[j].isLetter() && !s[j].isDigit()){
                j--
            }else{
                if(s[i].lowercaseChar() != s[j].lowercaseChar()){
                    return false
                }
                i++
                j--
            }
        }
        return true
    }
}
