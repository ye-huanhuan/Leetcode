package month_10.day30;

import java.util.ArrayList;
import java.util.List;

public class Test60 {

    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        List<Integer> res = s2.majorityElement(new int[]{1,1,1,3,3,2,2,2});
        System.out.println(res);

    }
}

/**
 * 229. 求众数 II
 */
class Solution02 {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = 0, num2 = 1;
        int count1 = 0, count2 = 0;
        for(int num: nums) {
            if (count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if (num1 == num) {
                count1 ++;
            } else if (count2 == 0) {
                num2 = num;
                count2 = 1;
            } else if (num2 == num) {
                count2 ++;
            } else {
                count1 --;
                count2 --;
                if (count1 == 0 && count2 > 0) {
                    num1 = num2;
                    count1 = count2;
                    num2 = 0;
                    count2 = 0;
                }
            }
        }
        if (count1 > 0) {
            count1 = 0;
            for(int num: nums) if (num1 == num) count1 ++;
        }
        if (count2 > 0) {
            count2 = 0;
            for(int num: nums) if (num2 == num) count2 ++;
        }
        List<Integer> results = new ArrayList<>();
        if (count1*3>nums.length) results.add(num1);
        if (count2*3>nums.length) results.add(num2);
        return results;
    }
}
