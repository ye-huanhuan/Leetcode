package review;


public class Test01 {
    //买卖股票的最佳时机
    public int maxProfit(int[] prices) {
        //维护前i-1天的最小值
        int min = Integer.MAX_VALUE;
        //维护前i-1天的最大收益
        int maxProfit = Integer.MIN_VALUE;

        for(int price : prices) {
            if(price < min) {
                min = price;
            }
            //前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
            if((price - min) >= maxProfit) {
                maxProfit = price - min;
            }
        }
        return maxProfit;
    }
}
