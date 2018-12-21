package leetcode;

public class Test02 {
    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        int res = s2.addDigits(10);
        System.out.println(res);
    }
}

/**
 * 258. 各位相加
 */
class Solution02 {
    public int addDigits(int num) {
        if(num < 10) return num;
        int sum = 0;
        while((num/10) != 0) {
            sum += num%10;
            num /= 10;
        }
        sum += num % 10;
        return addDigits(sum);
    }
}