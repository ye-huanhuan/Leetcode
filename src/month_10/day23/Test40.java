package month_10.day23;

public class Test40 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0};
        Solution02 s2 = new Solution02();
        s2.sortColors(nums);
        for(int num : nums) {
            System.out.print(num + "  ");
        }
    }
}

/**
 * 颜色分类
 * 使用双指针将红色和蓝色分别放入前方和后方，白色自动归为中间
 * 注意2的时候交换完指针不应该下移，并且需要判断2指针与当前i指针的相对位置
 */
class Solution02 {
    public void sortColors(int[] nums) {
        int redIndex = 0;
        int blueIndex = nums.length-1;
        int tmp = -1;
        for(int i=0; i<nums.length; ) {
            if(nums[i] == 0) {
                tmp = nums[redIndex];
                nums[redIndex] = nums[i];
                nums[i] = tmp;
                redIndex++;
                i++;
            } else if(nums[i] == 2) {
                if(i>blueIndex) break;
                tmp = nums[blueIndex];
                nums[blueIndex] = nums[i];
                nums[i] = tmp;
                blueIndex--;
            } else {
                i++;
            }
        }
    }
}