package leetcode;

public class Test04 {

    /**
     * 198.打家劫舍
     * 使用动态规划从后往前计算
     * 每个房间只有两种状态，打劫或者不打劫
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if(nums == null || nums.length ==0) {
            return 0;
        }
        int len = nums.length;
        int res[] = new int[len];
        res[len-1] = nums[len-1];
        for(int i=len-2; i>=0; i--) {
            res[i] = Math.max(nums[i] + (i+2 >= len ? 0 : nums[i+2]), nums[i+1] + (i+3 >= len ? 0 : nums[i+3]));
        }
        return res[0];
    }


}
