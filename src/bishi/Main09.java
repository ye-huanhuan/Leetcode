package bishi;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        if(a == b) {
            System.out.println(0);
        }
        int[] dp = new int[201];
        dp[a] = 0;

        for(int i=a+1; i<=b; i++) {
            dp[i] = Math.min(dp[i-1] + 1, dp[i/2] + 1);
        }
        System.out.println(dp[b]);
    }
}
