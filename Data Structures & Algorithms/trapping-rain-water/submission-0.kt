class Solution {
    fun trap(height: IntArray): Int {
      var result = 0 
      var i = 0
      var j = height.size -1 
      var leftArray = IntArray(height.size)
      var rightArray = IntArray(height.size)
      var left = 0
      var right = 0
      for(i in height.indices){
         leftArray[i] = left
         left = maxOf(height[i],left)
      }
      for(i in height.size-1 downTo 0){
         rightArray[i] = right
         right = maxOf(height[i],right)    
      }
      for(i in height.indices){
        val level = minOf(leftArray[i],rightArray[i]) - height[i]
        if(level > 0) 
            result += level
      }


      return result
    }
}
