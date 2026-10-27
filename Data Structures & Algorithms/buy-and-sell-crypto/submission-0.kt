class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for(i in prices.indices){
            for(j in i+1 until prices.size){
                var profit =  prices[j] - prices[i]
                if(profit > maxProfit){
                    maxProfit = profit
                }
            }
        }
        return maxProfit
    }
}
