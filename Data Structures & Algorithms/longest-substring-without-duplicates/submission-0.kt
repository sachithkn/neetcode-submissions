class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var i = 0 
        var j = 0
        var res = 0
        var cur = HashSet<Char>()
        while(i< s.length){
            while(cur.contains(s[i])){
                if(res < cur.size){
                    res = cur.size
                }
                cur.remove(s[j])
                j++
            }
            cur.add(s[i])
            i++
        }
        return maxOf(res,cur.size)
    }

}
