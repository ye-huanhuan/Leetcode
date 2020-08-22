package bishi;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int number = Integer.valueOf(read.nextLine());
        String[] tmp = read.nextLine().split(" ");
        int[] money = new int[tmp.length];
        for(int i=0; i< tmp.length; i++) {
            money[i] = Integer.valueOf(tmp[i]);
        }
        if(money.length != number || money.length == 1 || money.length == 0) {
            System.out.println(0);
        }
        int start = 0;
        long start_sum = money[start];
        int end = money.length-1;
        long end_sum = money[end];
        long max = 0;
        while(end > start) {
            if(start_sum == end_sum && start_sum > max) {
                max = start_sum;
                start++;
                start_sum += money[start];
            }else if(start_sum > end_sum) {
                end--;
                end_sum += money[end];
            }else if(start_sum < end_sum) {
                start++;
                start_sum += money[start];
            }
        }
        System.out.println(max);
    }

}
