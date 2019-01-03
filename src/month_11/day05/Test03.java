package month_11.day05;

public class Test03 {
}

/**
 * 53. 最大子序和
 */
class Solution {
    //使用动态规划求解；整个数组的最大子序列和等于前n-1个数的最大子序列和加上自己（自己为正数）或者就是前n-1个数的最大子序列和（自己为负数）;
    //如果前n-1个数的和为负数，则最大子序列和为自己
    public int maxSubArray(int[] nums) {

        if(nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i=0; i<nums.length; i++) {
            if(tmp < 0) tmp = 0;
            tmp += nums[i];
            max = Math.max(tmp, max);
        }
        return max;
    }
}