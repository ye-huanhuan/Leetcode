package month_10.day17;

public class Test23 {
}

/**
 * 买卖股票的最佳时机 II
 */
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 1) return 0;
        int res = 0;
        for(int i=1; i<prices.length; i++) {
            res += Math.max(0,prices[i] - prices[i-1]);
        }
        return res;
    }
}