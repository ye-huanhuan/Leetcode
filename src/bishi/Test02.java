package bishi;

public class Test02 {
    public static void main(String[] args) {
        int res = foo(5);
        System.out.println(res);
    }
    static int foo(int n) {
        if(n < 2) return n;
        return foo(n-1) + foo(n-2);
    }
}
