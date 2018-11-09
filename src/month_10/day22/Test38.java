package month_10.day22;

public class Test38 {
    public static void main(String[] args) {
        Solution10 s10 = new Solution10();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int res = s10.removeDuplicates(nums);
        for(int i=0; i<res; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

/**
 * 删除排序数组中的重复项
 */
class Solution10 {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[index]) {
                nums[index+1] =nums[i];
                index++;
            }
        }
        return index + 1;
    }
}