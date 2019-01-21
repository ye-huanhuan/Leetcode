package month_10.day25;

public class Test52 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        s3.maxProfit(new int[] {7,1,5,3,6,4});
    }
}

/**
 * 买卖股票的最佳时机
 * * 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
 */


class Solution03 {
    public int maxProfit(int[] prices) {
        //维护前i-1天的最小值
        int min = Integer.MAX_VALUE;
        //维护前i-1天的最大收益
        int maxProfit = 0;

        for(int p : prices) {
            if(p < min) {
               min = p;
            }
            if((p - min) > maxProfit) {
                maxProfit = p - min;
            }
        }
        return maxProfit;
    }
}
