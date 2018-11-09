package month_10.day22;

public class Test37 {
}

/**
 * 移除元素
 */
class Solution09 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int num : nums) {
            if(num != val) {
                nums[i++] = num;
            }
        }
        return i;
    }
    public int removeElement02(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        while(i != j) {
           if(nums[i] == val && nums[j] != val) {
               nums[i] = nums[j];
               i++;
               j--;
           } else if(nums[i] == val && nums[j] == val){
               j--;
           } else if(nums[i] != val && nums[j] == val){
               j--;
           } else {
               i++;
           }
        }
        if(j < i) return i;
        else return nums[i] == val ? i : i+1;
    }
}