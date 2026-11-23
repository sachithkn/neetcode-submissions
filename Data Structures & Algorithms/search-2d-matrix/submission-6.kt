class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if(matrix.isEmpty()) return false

        var l = 0
        var r = (matrix.size * matrix[0].size) - 1
        while(l<=r){
            var mid = l + ((r-l)/2)
            var i = mid/matrix[0].size
            var j = mid%matrix[0].size
            var cur = matrix[i][j]
            if(cur < target){
                l = mid + 1
            }else if(cur > target){
                r = mid - 1
            }else{
                return true
            }
        }
        return false
    }
}