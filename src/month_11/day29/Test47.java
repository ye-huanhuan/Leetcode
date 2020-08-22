package month_11.day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test47 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,0,1,1,2};
        Solution02 s2 = new Solution02();
        List<List<Integer>> res = s2.threeSum(nums);
        for(List<Integer> list : res) {
            System.out.println(list);
        }
        System.out.println(res.size());
    }
}

/**
 * 15.三数之和
 */
class Solution02 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) return res;
        Arrays.sort(nums);
        for(int i=0; i<nums.length ; i++) {
            int first = i+1;
            int seconde = nums.length - 1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            while(first < seconde) {
                if(nums[first] + nums[seconde] == (0-nums[i])) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[first]);
                    tmp.add(nums[seconde]);
                    res.add(tmp);
                    while(first+1 < nums.length && nums[first] == nums[first+1]) {
                        first++;
                    }
                    first++;
                    while(seconde-1 >= 0 && nums[seconde] == nums[seconde-1]) {
                        seconde--;
                    }
                    seconde--;
                } else if(nums[first] + nums[seconde] > (0-nums[i])) {
                    seconde--;
                } else {
                    first++;
                }
            }
        }
        return res;
    }


}

