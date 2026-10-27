class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var minBuy = prices[0]
        for(price in prices){
            maxProfit = maxOf(price - minBuy,maxProfit)
            minBuy = minOf(price,minBuy)
        }
        return maxProfit
    }
}
