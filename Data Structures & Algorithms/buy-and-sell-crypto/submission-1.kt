class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var i = 0 
        var j = 1
        while(j < prices.size){
            if(prices[i] < prices[j]){
                val profit = prices[j] - prices[i]
                maxProfit = maxOf(profit,maxProfit)
            }else{
                i=j
            }
            j++
        }
        return maxProfit
    }
}
