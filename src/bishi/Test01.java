package bishi;


public class Test01 {
    static int cnt = 0;
    public static void main(String[] args) {
        System.out.println("hel".charAt(0));
//        fib(6);
//        System.out.println(cnt);
    }
    static int fib(int n) {
        cnt++;
        if (n == 0)
            return 1;
        else if (n == 1)
            return 2;
        else
            return fib(n - 1) +
                    fib(n - 2);
    }
}
