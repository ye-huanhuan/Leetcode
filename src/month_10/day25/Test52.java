package month_10.day25;

public class Test52 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        s3.maxProfit(new int[] {7,1,5,3,6,4});
    }
}

/**
 * 买卖股票的最佳时机
 */
class Solution03 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
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
