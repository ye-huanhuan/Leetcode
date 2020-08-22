package bishi;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int tmp = 1;
        for(int i=2; i<=n; i++) {
            tmp *= i;
            while(tmp%10==0) {
                tmp /= 10;
            }
            tmp %= 10;
        }
        System.out.println(tmp);
    }
}
