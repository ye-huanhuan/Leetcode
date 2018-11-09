package month_11.day07;

public class Test03 {
    public static void main(String[] args) {
        int[] testArr = new int[]{1,2,3,4};
        Solution04 s4 = new Solution04();
        int[] res = s4.productExceptSelf(testArr);
        for(int t:res) {
            System.out.print(t + "  ");
        }
    }
}

/**
 * 238. 除自身以外数组的乘积
 */
class Solution04 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int[] proMuti = new int[len];
        int[] tailMuti = new int[len];
        proMuti[0] = nums[0];
        tailMuti[len-1] = nums[len-1];
        for(int i=1; i<len; i++) {
            proMuti[i] = nums[i] * proMuti[i-1];
            tailMuti[len-i-1] = nums[len-i-1] * tailMuti[len-i];
        }
        res[0] = tailMuti[1];
        res[len-1] = proMuti[len-2];
        for(int j=1; j<len-1; j++) {
            res[j] = proMuti[j-1] * tailMuti[j+1];
        }
        return res;
    }
}
