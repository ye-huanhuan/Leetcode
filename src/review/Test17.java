package review;

import java.util.Arrays;

/**
 * 594.最长和谐子序列
 */
public class Test17 {
    public static void main(String[] args) {
        int[] test = {1,3,2,2,5,2,3,7};
        Test17 t17 = new Test17();
        int res = t17.findLHS(test);
        System.out.println(res);
    }
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int maxLen = 0;
        while(j<nums.length) {
            if(nums[j] - nums[i] == 1) {
                maxLen = Math.max(maxLen, j-i+1);
                j++;
            } else if(nums[j] - nums[i] < 1){
                j++;
            } else {
                i++;
            }
        }
        return maxLen;
    }
}
