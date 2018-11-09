package month_10.day22;

public class Test36 {
}

/**
 * 移动零
 */
class Solution08 {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                for(int j=i+1; j<nums.length; j++) {
                    if(nums[j] != 0) {
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                        break;
                    }
                }
            }
        }
    }
}