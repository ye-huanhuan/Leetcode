package leetcode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test18 {

    public static void main(String[] args) {
        Test18 t18 = new Test18();
        String[] res = t18.findRelativeRanks(new int[]{3,9,7,2,10,8});
        for(String s : res) {
            System.out.print(s + "  ");
        }
    }
//    相对名次
    public String[] findRelativeRanks(int[] nums) {
        Integer[] nums02 = new Integer[nums.length];
        for(int i=0; i<nums.length; i++) {
            nums02[i] = Integer.valueOf(nums[i]);
        }
        Arrays.sort(nums02, (a, b) -> b-a);
        Map<Integer, Integer> numToRank = new HashMap<>();
        for(int i=1; i<=nums02.length; i++) {
            numToRank.put(nums02[i-1], i);
        }
        String[] res = new String[nums.length];

        for(int j=0; j<res.length; j++) {
            if(numToRank.get(nums[j]) == 1) {
                res[j] = "Gold Medal";
            } else if(numToRank.get(nums[j]) == 2) {
                res[j] = "Silver Medal";
            } else if(numToRank.get(nums[j]) == 3) {
                res[j] = "Bronze Medal";
            } else {
                res[j] = String.valueOf(numToRank.get(nums[j]));
            }
        }
        return res;
    }
}
