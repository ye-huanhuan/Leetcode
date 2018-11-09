package month_10.day23;

import java.util.Arrays;

public class Test46 {
    public static void main(String[] args) {
        Solution08 s8 = new Solution08();
        int res = s8.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        System.out.println(res);
    }
}

/**
 * 长度最小的子数组
 */
class Solution08 {
    public int minSubArrayLen(int s, int[] nums) {
        int i = 0;
        int j = 0;
        int len = nums.length;
        int res = nums.length + 1;
        int sum = 0;
        while(i<len) {
            if(sum < s && j<len) {
                sum += nums[j];
                j++;
            } else {
                sum -= nums[i];
                i++;
            }
            if(sum >= s && res >= j-i) res = j-i;
        }
        if(res == nums.length + 1) return 0;
        return res;
    }
    public int minSubArrayLen02(int s, int[] nums) {
        if(nums.length < 1) return 0;
        int minLen = nums.length;
        int numsLen = nums.length;
        int flag = 0;
        for(int i=0; i<numsLen; i++) {
            int sum = nums[i];
            if(sum >= s) {
                minLen = 1;
                break;
            }
            for(int j=i+1; j<numsLen; j++) {
                sum += nums[j];
                if(sum >= s && j-i+1 <= minLen) {
                    minLen = j-i+1;
                    flag = 1;
                    break;
                } else if(sum >= s && j-i+1 > minLen) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return 0;
        }
        return minLen;
    }
}