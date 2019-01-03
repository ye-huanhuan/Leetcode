package month_11.day20;

import java.util.Arrays;

public class Test30 {
}

/**
 * 621. 任务调度器
 */
class Solution03 {
    public int leastInterval(char[] tasks, int n) {
        int[] nums = new int[26];
        for(char c : tasks) {
            nums[c-'A']++;
        }
        //升序
        Arrays.sort(nums);
        int count = 1;
        for(int i=24; i>=0; i--) {
            if(nums[i] == nums[25]) {
                count++;
            } else {
                break;
            }
        }
        //要么中间插了空闲时间，要么没插空闲时间
        return Math.max(tasks.length, (nums[25]-1) * (n+1) + count);
    }
}