package month_11.day12;

public class Test15 {
}


/**
 * 303. 区域和检索 - 数组不可变
 */
class NumArray {
    int[] sums;
    int len;
    public NumArray(int[] nums) {

        this.len = nums.length;
        sums = new int[len];
        if(len >= 1) {
            sums[0] = nums[0];
        }
        for(int i=1; i<len; i++){
            sums[i] = sums[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {

        return sums != null && i == 0 ? sums[j] : sums[j] - sums[i-1];
    }
}
