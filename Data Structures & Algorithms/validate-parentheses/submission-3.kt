class Solution {
    fun isValid(s: String): Boolean {
        val first = listOf('(','{','[')
        val second = listOf(')','}',']')

        val stack = Stack<Char>()
        for(c in s){
            if(second.contains(c)){
                if(stack.isEmpty){
                    return false
                }
                val last = stack.pop()
                val index = second.indexOf(c)
                if(last != first[index]) return false
            }else{
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}
