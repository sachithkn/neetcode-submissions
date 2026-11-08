class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        var stack = Stack<Int>()
        var opr = arrayOf("+","-","*","/")
        for(tok in tokens){
            if(opr.contains(tok)){
                var first = stack.pop()
                var res = stack.pop()
                if(tok.equals("+")){
                    res += first
                }else if(tok.equals("-")){
                    res -= first
                }else if(tok.equals("*")){
                    res *= first
                }else if(tok.equals("/")){
                    if(first == 0) return 0
                    res /= first
                }
                stack.push(res)
            }else{
                stack.push(tok.toInt())
            }
        }
        return stack.pop()
    }
}
