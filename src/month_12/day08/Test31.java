package month_12.day08;

public class Test31 {
    public static void main(String[] args) {
        int test = 23;
        Solution s = new Solution();
        int res = s.NumberOf1Between1AndN_Solution(test);
        System.out.println(res);
    }
}

/**
 * 整数中1出现的次数
 *
 k = n % (i * 10)
 count(i) = (n / (i * 10)) * i + (if(k > i * 2 - 1) i else if(k < i) 0 else k - i + 1)
 前半段求整个阶梯上1的个数，后半段求不满阶梯的1的个数
 */
class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0) {
            return 0;
        }
        int count = 0;
        for(int i=1; i<=n; i*=10) {
            int k = n%(i*10);
            count += (n/(i*10)) * i;
            int incre = 0;
            if(k > (i*2-1)) {
                incre = i;
            } else if(k < i) {
                incre = 0;
            } else {
                incre = k - i + 1;
            }
            count+= incre;
        }
        return count;
    }
}