package month_11.day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test47 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0};
        Solution02 s2 = new Solution02();
        List<List<Integer>> res = s2.threeSum(nums);
        System.out.println(res.size());
    }
}


class Solution02 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) return res;
//        int flag = 1;
//        for(int num : nums) {
//            if(num != 0) flag = 0;
//        }
//        if(flag == 1) {
//            List<Integer> tmp = new ArrayList<>();
//            tmp.add(0);
//            tmp.add(0);
//            tmp.add(0);
//            res.add(tmp);
//            return res;
//        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length ; i++) {
//            if(i != 0 && nums[i] == nums[i]-1) continue;
            int[] indexs = twoSum(nums, (0 - nums[i]), i+1);
            if(i != indexs[0] && i != indexs[1] && indexs[0] != -1 && indexs[1] != -1) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[i]);
                tmp.add(nums[indexs[0]]);
                tmp.add(nums[indexs[1]]);
                res.add(tmp);
            }
        }
        return res;
    }

    public int[] twoSum(int[] numbers, int target, int start) {
        if(numbers.length == 0 || numbers.length == 1) return new int[]{-1,-1};
        if(numbers.length == 2 && numbers[0] + numbers[1] != target) return new int[]{-1,-1};
        int i = start;
        int j = numbers.length-1;
        while(i < j) {
            if(numbers[i] + numbers[j] == target) return new int[]{i,j};
            else if(numbers[i] + numbers[j] > target) j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}

