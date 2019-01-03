package leetcode;

public class Test04 {

    public static void main(String[] args) {
        Test04 t4 = new Test04();
        int[] test = new int[]{2,7,9,3,1};
        int res = t4.rob(test);
        System.out.println(res);
    }

    /**
     * 198.打家劫舍
     * 使用动态规划从前往后计算
     * 每个房间只有两种状态，打劫或者不打劫
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if(nums == null || nums.length ==0) {
            return 0;
        }
        if(nums.length < 2) {
            return nums[0];
        }
        int len = nums.length;
        int res[] = new int[len];
        res[0] = nums[0];
        res[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<len; i++) {
            //状态转移方程，每个房间只有两种状态，抢或者不抢
            res[i] = Math.max(res[i-1], nums[i] + res[i-2]);
        }
        return res[len-1];
    }


}
