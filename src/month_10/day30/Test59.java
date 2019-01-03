package month_10.day30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test59 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.majorityElement(new int[]{3,2,3});
        System.out.println(res);
    }
}

/**
 * 169.求众数(超过n/2的数)
 */
class Solution {
    public int majorityElement(int[] nums) {
        int x = -1;
        int count = 0;
        for(int num : nums) {
            if(count == 0) {
                x = num;
                count++;
                continue;
            }
            if(x == num) {
                count++;
            } else {
                count--;
            }
        }
        return x;
    }
    public int majorityElement02(int[] nums) {
        Map<Integer,Integer> numCount = new HashMap<>();
        int i = 0;
        int j = nums.length - 1;
        while(i<j) {
            if(numCount.containsKey(nums[i])) {
                numCount.put(nums[i],numCount.get(nums[i]) + 1);
            } else {
                numCount.put(nums[i], 1);
            }
            if(numCount.containsKey(nums[j])) {
                numCount.put(nums[j],numCount.get(nums[j]) + 1);
            } else {
                numCount.put(nums[j], 1);
            }
            i++;
            j--;
        }
        if(i==j) {
            if(numCount.containsKey(nums[i])) {
                numCount.put(nums[i],numCount.get(nums[i]) + 1);
            } else {
                numCount.put(nums[i], 1);
            }
        }
        Iterator<Integer> iter = numCount.keySet().iterator();
        int maxCount = 0;
        int num = -1;
        while(iter.hasNext()) {
            int tmp = iter.next();
            if(numCount.get(tmp) >= maxCount) {
                maxCount = numCount.get(tmp);
                num = tmp;
            }
        }
        return num;
    }
}
