package month_12.day07;

public class Test30 {
}

/**
 * 连续子数组的最大和
 */
class Solution06 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for(int i : array) {
            if(tmp < 0) tmp = 0;
            tmp += i;
            max = Math.max(tmp, max);
        }
        return max;
    }
}