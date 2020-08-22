package bishi;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String data = read.nextLine();
        String[] tmp = data.split(",");
        int[] cost = new int[1000];
        for(int i=0; i<tmp.length; i++){
            cost[i] = Integer.valueOf(tmp[i]);
        }
        if(cost == null) {
            System.out.println(0);
        }
        if(tmp.length == 1) {
            System.out.println(cost[0]);
        }
        if(tmp.length == 2) {
            System.out.println(Math.min(cost[0], cost[1]));
        }
        for(int i=2; i<tmp.length; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }

        System.out.println(Math.min(cost[tmp.length-1], cost[tmp.length-2]));
    }
}
