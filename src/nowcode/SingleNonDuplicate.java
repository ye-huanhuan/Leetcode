package nowcode;

public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        while(low < high) {
            int mid = (low + high)/2;
            boolean isEven = (high - mid)%2 == 0;
            if(nums[mid] == nums[mid - 1]) {
                if(isEven) {
                    high = mid - 2;
                } else {
                    low = mid + 1;
                }

            } else if (nums[mid] == nums[mid + 1]) {
                if(isEven) {
                    low = mid + 2;
                } else {
                    high = mid - 1;
                }
            } else {
                return nums[mid];
            }

        }
        return nums[low];
    }
}
