package bishi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        int[] ball = new int[num];
        for(int i=0; i<num; i++) {
            ball[i] = read.nextInt();
        }
        Map<Integer, Integer> ballToNum = new HashMap<>();
        for(int b : ball) {
            if(!ballToNum.containsKey(b)) {
               ballToNum.put(b, 0);
            }
            ballToNum.put(b, ballToNum.get(b) + 1);
        }
        Object[] values = ballToNum.values().toArray();
        int[] nums = new int[values.length];
        for(int i=0; i<values.length; i++) {
            nums[i] = (int)values[i];
            if(nums[i] < 2) {
                System.out.println(0);
                return;
            }
        }
        Arrays.sort(nums);
        int flag = 2;
        int tmp = nums[nums.length-1];
        int x = 0;
        while(tmp >= 2) {
            for(int j=nums.length-2; j>=0; j--) {
                if(nums[j]%tmp != 0) {
                    tmp = nums[nums.length-1]/flag;
                    flag++;
                    break;
                }
                if(j == 0) {
                    x = tmp;
                    tmp = -1;
                }
            }
        }
        if(tmp == -1) {
            int sum = 0;
            for(int n : nums) {
                sum += n/x;
            }
            System.out.println(sum);
        } else {
            System.out.println(0);
        }
    }
}
