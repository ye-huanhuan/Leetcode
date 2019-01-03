package month_12.day04;

public class Test11 {
}

/**
 * 二进制中1的个数
 */
class Solution05 {
    public int NumberOf1(int n) {
        int res = 0;
        int flag = 1;
        while(flag >= 1) {
            if((flag & n) > 0) {
                res++;
            }
            flag = flag << 1;
        }
        return res;
    }

    public int NumberOf102(int n) {
        int res = 0;

        while(n > 0) {
            res++;
            n = n & (n-1);
        }
        return res;
    }
}