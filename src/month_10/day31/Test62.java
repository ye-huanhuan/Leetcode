package month_10.day31;


import java.util.Scanner;

/**
 * 牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。

 但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。
 牛牛希望你能帮他计算一共有多少个可能的数对。

 输入包括两个正整数n,k(1 <= n <= 10^5, 0 <= k <= n - 1)。
 对于每个测试用例, 输出一个正整数表示可能的数对数量。

 5 2
 7

 满足条件的数对有(2,3),(2,4),(2,5),(3,4),(3,5),(4,5),(5,3)
 */
public class Test62 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int k = read.nextInt();
        if(k == 0) {
            System.out.println(n*n);
            return;
        }
        int res = 0;
        for(int i=1; i<=n ;i++) {
            for(int j=1; j<=n; j++) {

                if(i%j >= k) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
