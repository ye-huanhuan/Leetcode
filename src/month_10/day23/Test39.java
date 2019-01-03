package month_10.day23;

public class Test39 {
}

/**
 * 删除排序数组中的重复项II
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        int index = 0;
        nums[index++] = nums[0];
        nums[index++] = nums[1];
        for(int i=2; i<nums.length; i++) {
            if(nums[i] != nums[index-2]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
