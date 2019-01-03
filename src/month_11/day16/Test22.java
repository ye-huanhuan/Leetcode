package month_11.day16;

public class Test22 {
}

/**
 * 704. 二分查找
 */
class Solution03 {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}