package month_12.day13;

public class Test48 {
    public static void main(String[] args) {
        Solution06 s6 = new Solution06();
        int res = s6.Add(4,7);
        System.out.println(res);
    }
}


/**
 * 不用加减乘除做加法
 */

class Solution06 {
    public int Add(int num1,int num2) {
        while(num2 != 0) {
            int tmp = num1 ^ num2;
            num2 = (num1 & num2) << 1;
            num1 = tmp;
        }
        return num1;
    }
}