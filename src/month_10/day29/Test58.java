package month_10.day29;

public class Test58 {
    public static void main(String[] args) {
        Solution04 s4 = new Solution04();
        System.out.println(s4.reverse(1534236469));
        System.out.println(s4.reverse(-123));

    }
}

/**
 *   7. 反转整数
 */
class Solution04 {
    public int reverse(int x) {
        int res = 0;
        char flag = 1;
        if (x < 0) {
            flag = 0;
            x -= (2 * x);
        }
        while (x > 0) {
            int tmp = x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) return 0;
            res = res * 10 + tmp;
        }

        return flag == 0 ? res - 2 * res : res;
    }
}