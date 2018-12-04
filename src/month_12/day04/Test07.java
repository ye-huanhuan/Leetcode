package month_12.day04;

public class Test07 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.Fibonacci02(5);
        System.out.println(res);
    }
}

/**
 * 斐波那契数列
 */
class Solution {
    public int Fibonacci(int n) {
        if(n <= 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public int Fibonacci02(int n) {
        int f0 = 0;
        int f1 = 1;
        if(n == 0) return f0;
        if(n == 1) return f1;
        int tmp = -1;
        for(int i=0; i<n-1; i++) {
            tmp = f0;
            f0 = f1;
            f1 = tmp + f1;
        }
        return f1;
    }
}