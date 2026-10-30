class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var min = prices[0]
        for(pr in prices){
            result = maxOf(result,pr-min)
            min = minOf(min,pr)
        }
        return result
    }
}
