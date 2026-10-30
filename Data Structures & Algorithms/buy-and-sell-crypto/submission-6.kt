class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var l = 0
        var r = 1
        while(r<prices.size){
            if(prices[l]<prices[r]){
                var diff = prices[r] - prices[l]
                result = maxOf(result,diff)
            }else{
                l=r
            }
            r++
        }
        return result
    }
}
