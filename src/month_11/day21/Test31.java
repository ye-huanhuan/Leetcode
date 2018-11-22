package month_11.day21;

public class Test31 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.getSum(1,5);
        System.out.println(res);
    }
}

/**
 * 371. 两整数之和
 */

class Solution {
    public int getSum(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        //直到进位为0
        while(b != 0) {
            //不考虑进位
            int tmp = a ^ b;
            //进位
            b = (a & b) << 1;
            a = tmp;
        }
        return a;
    }
}