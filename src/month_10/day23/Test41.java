package month_10.day23;

import java.util.Arrays;

public class Test41 {
}
class Solution03 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
