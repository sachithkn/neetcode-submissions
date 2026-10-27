class Solution {
    fun trap(height: IntArray): Int {
      var result = 0 
      var i = 0
      var j = height.size -1 
      var left = height[i]
      var right = height[j]
      while(i<j){
        if(left<right){
            i++
            left = maxOf(height[i],left)
            result += left - height[i]
        }else{ 
            j--
            right = maxOf(height[j],right)   
            result += right - height[j]
        }
      }
      return result
    }
}
