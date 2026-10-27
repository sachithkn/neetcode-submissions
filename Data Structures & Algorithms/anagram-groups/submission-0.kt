class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<List<String>>()

        for(s in strs){
            var isAnagram = false
            for(r in result){
                val rs = r[0]
                if(isAnagram(s,rs)){
                    val index = result.indexOf(r)
                    val list = r.toMutableList()
                    list.add(s)
                    result.set(index,list)
                    isAnagram = true
                    break
                }
            }

            if(result.isEmpty() || !isAnagram){
                result.add(mutableListOf(s))
            }
        }

        return result
    }

    fun isAnagram(s:String,t:String):Boolean{
        val sa = s.toCharArray().sorted()
        val ta = t.toCharArray().sorted()
        return sa.equals(ta)
    }
}
