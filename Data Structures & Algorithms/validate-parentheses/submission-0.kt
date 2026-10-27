class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val map = mutableMapOf<Char,Char>()
        map[')'] = '('
        map[']'] = '['
        map['}'] = '{'

        for(c in s){
            if(!stack.isEmpty() && stack.peek() == map[c]){
                stack.pop()
            }else{
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}
