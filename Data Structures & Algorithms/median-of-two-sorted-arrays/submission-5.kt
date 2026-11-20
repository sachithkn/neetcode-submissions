class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val (first,second) = if(nums2.size < nums1.size){
            nums2 to nums1
        }else{
            nums1 to nums2            
        }

        val size = first.size + second.size
        val half = size/2
        var l = 0
        var r = first.size
        while(l<=r){
            val mid1 = l + ((r-l)/2)
            val mid2 = half - mid1
            val left1 = if(mid1 > 0){
                first[mid1-1]
            }else{
                Int.MIN_VALUE
            }
            val left2 = if(mid2 > 0){
                second[mid2-1]
            }else{
                Int.MIN_VALUE
            }
            val right1 = if(mid1 < first.size){
                first[mid1]
            }else{
                Int.MAX_VALUE
            }
            val right2 = if(mid2 < second.size){
                second[mid2]
            }else{
                Int.MAX_VALUE
            }
            if(left1 <= right2 && left2 <= right1){
                return if(size % 2 == 0){
                    (maxOf(left1, left2).toLong() + minOf(right1, right2).toLong()).toDouble() / 2
                }else{
                    minOf(right1,right2).toDouble()
                }
            }else if(left1 > right2){
                r = mid1 - 1
            }else{
                l = mid1 + 1
            }
        }
        return 0.0
    }
}
