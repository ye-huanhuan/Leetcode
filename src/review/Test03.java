package review;

public class Test03 {
    //最大子序和
    public int maxSubArray(int[] nums) {
       int max = Integer.MIN_VALUE;
       int tmp = 0;
       for(int num : nums) {
           //状态转移方程为：第i的最大值=Math.max(i-1的最大值 , Math.max(0,前i-1个值的和)+i)
           if(tmp < 0) {
               tmp = 0;
           }
           tmp = tmp + num;
           max = Math.max(max, tmp);
       }
       return max;
    }
}
