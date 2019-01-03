package review;

public class Test02 {
    public static void main(String[] args) {
        Test02 t2 = new Test02();
        int res = t2.climbStairs(3);
        System.out.println(res);
    }
    //爬楼梯
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        if(n == 1) {
            return a;
        }
        if(n == 2) {
            return b;
        }
        //状态转移方程：第i个楼梯的路径数=第i-1个楼梯的路径数+第i-2个楼梯的路径数
        for(int i=3; i<=n; i++) {
            int tmp = a;
            a = b;
            b = b+tmp;
        }
        return b;
    }
}
