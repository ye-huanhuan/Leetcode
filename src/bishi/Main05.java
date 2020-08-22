package bishi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        List<Bolock> bolocks = new ArrayList<>();
        for(int i=0; i<number; i++) {
            int w = read.nextInt();
            int l = read.nextInt();
            bolocks.add(new Bolock(w, l));
        }
        bolocks.sort(new Comparator<Bolock>() {
            @Override
            public int compare(Bolock o1, Bolock o2) {
                return o1.w - o2.w;
            }
        });
        int[] ls = new int[number];
        for(int i=0; i<bolocks.size(); i++) {
            ls[i] = bolocks.get(i).getL();
        }
        int res = findLengthOfLIS(ls);
        System.out.println(res);
    }

    public static int findLengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int maxLength = 1;
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length; i++) {
            dp[i] = 1;
            for(int j=i-1; j>=0; j--) {
                if(nums[j] <= nums[i] && dp[j]+1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
}

class Bolock {
    int w;
    int l;

    public Bolock(int w, int l) {
        this.w = w;
        this.l = l;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
}
