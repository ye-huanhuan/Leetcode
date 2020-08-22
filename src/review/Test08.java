package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 */
public class Test08 {
    public static void main(String[] args) {
        int[] test = {1,1};
        Test08 t8 = new Test08();
        List<Integer> res = t8.findDisappearedNumbers(test);
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return res;
        }
        for(int i=0; i<nums.length;){
            //已经在正确位置或者正确位置上的数就是该数
            if(nums[i] == i+1 || nums[i] == nums[nums[i] - 1]) {
                i++;
            } else {
                swap(nums, i, nums[i] -1);
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                res.add(i+1);
            }
        }
        return res;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
