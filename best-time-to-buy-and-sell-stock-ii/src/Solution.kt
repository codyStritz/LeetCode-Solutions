fun main(args: Array<String>) {
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}

fun maxProfit(prices: IntArray): Int {
    var profit = 0;

    for (i in 0 until prices.size - 1) {
        val today = prices[i]
        val tomorrow = prices[i + 1]

        // If tomorrow's price will be higher than today's -> Buy and Sell
        // If not, you know you'd be better off buying tomorrow rather than today.
        if (tomorrow > today) {
            profit += tomorrow - today
        }
    }
    return profit
}
