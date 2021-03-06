package bishi;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String a = read.nextLine();
        String b = read.nextLine();
        int alen = a.length();
        int blen = b.length();
        if(alen == 0) {
            System.out.println(blen);
        }
        if(blen == 0) {
            System.out.println(alen);
        }

        int[][] dp = new int[alen][blen];

        for(int j=0;j<blen; j++) {
            dp[0][j] = j;
        }
        for(int i=0; i<alen; i++) {
            dp[i][0] = i;
        }

        for(int i=1; i<alen; i++) {
            for(int j=1; j<blen; j++) {
                int tmp = a.charAt(i) == b.charAt(j) ? 0 : 1;
                dp[i][j] = Math.min(dp[i-1][j-1] + tmp, Math.min(dp[i-1][j] + 1, dp[i][j-1] + 1));
            }
        }
        System.out.println(dp[alen-1][blen-1]);
    }
}
