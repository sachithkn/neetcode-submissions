class Solution {

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var rowMap = mutableMapOf<Int,MutableSet<Char>>()
        var colMap = mutableMapOf<Int,MutableSet<Char>>()
        var squMap = mutableMapOf<String,MutableSet<Char>>()
        for(i in board.indices){
            for(j in board.indices){
                if (board[i][j] == '.') continue;

                var squKey = "${i/3},${j/3}"
                if(rowMap.getOrPut(i) { mutableSetOf<Char>() }.contains(board[i][j]) ||
                    colMap.getOrPut(j) { mutableSetOf<Char>() }.contains(board[i][j]) ||
                    squMap.getOrPut(squKey) { mutableSetOf<Char>() }.contains(board[i][j])){
                        return false
                    }
                rowMap.getOrPut(i) { mutableSetOf<Char>() }.add(board[i][j])
                colMap.getOrPut(j) { mutableSetOf<Char>() }.add(board[i][j])
                squMap.getOrPut(squKey) { mutableSetOf<Char>() }.add(board[i][j])
            }
        }
        return true
    }
}