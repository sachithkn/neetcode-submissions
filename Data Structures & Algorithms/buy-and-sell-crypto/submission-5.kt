class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        for(i in prices.indices){
            for(j in i..prices.size-1){
                var diff = prices[j] - prices[i]
                if(diff> result){
                    result = diff
                }
            }
        }
        return result
    }
}
