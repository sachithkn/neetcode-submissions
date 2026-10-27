class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var row = Array(9){ HashSet<Char>()}
        var col = Array(9){ HashSet<Char>()}
        var box = Array(9){ HashSet<Char>()}
        for(i in 0 until 9){
          for (j in 0 until 9){
            if(board[i][j] != '.'){
              var boxIndex = (i/3) * 3 + j/3
              if(!row[i].add(board[i][j]) || !col[j].add(board[i][j])  || !box[boxIndex].add(board[i][j]) ){
                return false
              }
            }
          }
        }
        return true
    }
}
