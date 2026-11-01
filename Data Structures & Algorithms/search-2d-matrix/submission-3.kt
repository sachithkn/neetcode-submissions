class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
       if(matrix.isEmpty() || matrix[0].isEmpty()) return false

       var row = matrix.size
       var col = matrix[0].size
       var start = 0
       var end = row * col -1
       while(start<=end){
            var mid = start + ((end-start)/2)
            var i = mid/col
            var j = mid%col
            var midnum = matrix[i][j]
            if(midnum<target){
                start = mid+1
            }else if(midnum>target){
                end = mid-1
            }else{
                return true
            }
       }
       return false
    }
}
