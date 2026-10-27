class Solution {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rowMap = mutableMapOf<Int,MutableSet<Char>>()
        var colMap = mutableMapOf<Int,MutableSet<Char>>()
        var squMap = mutableMapOf<String,MutableSet<Char>>()

        for(i in board.indices){
            for(j in board[i].indices){
                if(board[i][j] == null || board[i][j] == '.')
                    continue

                if(rowMap.get(i) == null){
                    rowMap.set(i,mutableSetOf<Char>())
                }
                if(colMap.get(j) == null){
                    colMap.set(j,mutableSetOf<Char>())
                }
                var key = "${i/3},${j/3}"
                if(squMap.get(key) == null){
                    squMap.set(key,mutableSetOf<Char>())
                }
                if(rowMap[i]!!.contains(board[i][j]!!) ||
                    colMap[j]!!.contains(board[i][j]!!) ||
                    squMap[key]!!.contains(board[i][j]!!)){
                        return false
                }
                rowMap[i]!!.add(board[i][j])
                colMap[j]!!.add(board[i][j])
                squMap[key]!!.add(board[i][j])
            }
        }
        return true
    }
}