package month_10.day22;

import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int len = Integer.parseInt(read.nextLine());
        int[] arr = new int[len];
        int i = 0;
        for(String str:read.nextLine().split(" ")) {
            arr[i++] = Integer.parseInt(str);
        }
        Solution02 s2 = new Solution02();
        int res = s2.maxRes(len, arr);
        System.out.println(res);
    }
}

/**
 * 牛客网-字节跳动-最大子区间
 */
class Solution02 {
    public int maxRes(int len, int[] arr) {
        int max = 0;
        for(int i=0; i<len; i++) {
            int sum = 0;
            int min = arr[i];
            for(int j=i; j<len; j++) {
                sum += arr[j];
                if(arr[j] < min){
                    min = arr[j];
                }
                if(min*sum > max) {
                    max = min*sum;
                }
            }
        }
        return max;
    }
}
