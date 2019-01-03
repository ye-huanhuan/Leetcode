package month_10.day16;

public class Test21 {
    public static void main(String[] args) {
        Solution05 s5 = new Solution05();
        int result = s5.climbStairs(5);
        System.out.println(result);
    }
}

/**
 * 爬楼梯
 */
class Solution05 {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        if(n == 1) return a;
        if(n == 2) return b;
        int result = 0;
        while(n-2 > 0) {
            result = a+b;
            a = b;
            b = result;
            n--;
        }
        return result;
    }
}
