package month_11.day06;

public class Test07 {
}

/**
 * 268. 缺失数字
 */
class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int n = len + 1;
        //等差数列求和
        int sum = 0*n + (n*(n-1)/2)*1;
        for(int i=0; i<len; i++) {
            sum -= nums[i];
        }
        return sum;
    }
    //使用异或操作，将缺失数组和不缺失数组进行异或操作，剩下的就是缺失的数
    public int missingNumber02(int[] nums) {
        int n = nums.length;
        int len = nums.length;
        for(int i=0; i<len; i++) {
            n ^= i^nums[i];
        }
        return n;
    }

}
