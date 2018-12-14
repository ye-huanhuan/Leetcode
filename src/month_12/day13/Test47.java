package month_12.day13;

public class Test47 {
    public static void main(String[] args) {
        Solution05 s5 = new Solution05();
        int res = s5.Sum_Solution(4);
        System.out.println(res);

    }
}

/**
 * 求1+2+3+...+n
 */
class Solution05 {
    public int Sum_Solution(int n) {
        int sum = n;
        //利用短路原理实现分支
        boolean flag = n > 0 && (sum += Sum_Solution(n-1)) > 0;
        return sum;
    }
}