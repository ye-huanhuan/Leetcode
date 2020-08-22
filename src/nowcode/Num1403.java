package nowcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Num1403 {

    public static void main(String[] args) {

    }

    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        int sum1 = 0;
        int sum2 = 0;
        int i = -1;
        int j = nums.length;
        while(i<j) {
            if(sum1 >= sum2) {
                j--;
                sum2 += nums[j];
                res.add(nums[j]);
            } else {
                i++;
                sum1 += nums[i];
            }
        }
        return res;
    }
}
