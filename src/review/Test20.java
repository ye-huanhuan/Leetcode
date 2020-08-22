package review;

/**
 * 最大公约数
 */
public class Test20 {
    public static void main(String[] args) {
        Test20 t20 = new Test20();
        int res = t20.gcd02(12, 18);
        System.out.println(res);
    }
    public int gcd(int a, int b) {
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        int remain = x % y;
        while(remain != 0){
            x = y;
            y = remain;
            remain = x % y;
        }
        return y;
    }
    public int gcd02(int a, int b) {
        if(a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        return a%b == 0 ? b : gcd02(b, a%b);
    }
}
