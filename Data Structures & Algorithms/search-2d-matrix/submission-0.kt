class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if(matrix.isEmpty()) return false
        var row = matrix.size
        var col = matrix[0].size
        var end = (row * col)-1
        var start = 0
        while(start<=end){
            var mid = start+((end-start)/2)
            var x = mid/col
            var y = mid%col
            if(target == matrix[x][y]){
                return true
            }else if(target < matrix[x][y]){
                end = mid-1
            }else {
                start = mid+1
            }
        }
        return false
    }
}
