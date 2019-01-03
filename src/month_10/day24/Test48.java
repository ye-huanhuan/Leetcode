package month_10.day24;

public class Test48 {
}

/**
 * 137.只出现一次的数字II
 */
class Solution02 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0; i<32; i++) {
            int sum = 0;
            for(int num : nums) {
                if(((num >> i) & 1) == 1) {
                    sum++;
                }
            }
            if(sum % 3 == 1) {
                res = res | 1 << i;
            }
        }
        return res;
    }
}
