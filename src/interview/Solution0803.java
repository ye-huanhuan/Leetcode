package interview;

/**
 * DATE: 2020/8/22
 * DESCRIPTION: 魔术索引
 * 魔术索引。 在数组A[0...n-1]中，有所谓的魔术索引，满足条件A[i] = i。
 * 给定一个有序整数数组，编写一种方法找出魔术索引，若有的话，在数组A中找出一个魔术索引，如果没有，则返回-1。
 * 若有多个魔术索引，返回索引值最小的一个。
 * CREATE BY: yehuanhuan
 */
public class Solution0803 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        Solution0803 solution0803 = new Solution0803();
        int res = solution0803.findMagicIndex02(nums);
        System.out.println(res);
    }
    public int findMagicIndex(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == i) {
                return i;
            }
        }
        return -1;
    }

    //因为nums数组有序可以考虑二分剪枝
    private int ans;
    public int findMagicIndex02(int[] nums) {
        ans = -1;
        binSearch(nums, 0, nums.length-1);
        return ans;
    }

    public void binSearch(int[] nums, int low, int high) {
        if(low > high) {
            return;
        }
        int mid = (low + high)/2;
        if(nums[mid] == mid) {
            ans = mid;
            binSearch(nums, low, mid-1);
        } else {
            binSearch(nums, low, mid-1);
            //左边没搜到结果
            if(ans == -1 || ans > high) {
                binSearch(nums, mid+1, high);
            }
        }
    }
}
