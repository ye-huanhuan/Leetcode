package month_12.day18;

import java.util.ArrayList;
import java.util.Arrays;


public class Test64 {
    public static void main(String[] args) {
        int[] test = new int[]{2,3,4,2,6,2,5,1};
        Solution04 s4 = new Solution04();
        ArrayList<Integer> res = s4.maxInWindows(test, 3);
        Arrays.stream(res.toArray()).forEach(x -> System.out.println(x));
    }
}

/**
 * 滑动窗口的最大值
 */
class Solution04 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if(num == null || num.length == 0 || size == 0) return res;
        int maxValue = num[0];
        for(int i=0; i<num.length-size+1; i++) {
            if(i == 0 || num[i-1] == maxValue) {
                maxValue = num[i];
                for(int j=i; j<i+size; j++) {
                    if(num[j] >= maxValue){
                        maxValue = num[j];
                    }
                }
            } else {
                maxValue = Math.max(maxValue, num[i+size-1]);
            }
            res.add(maxValue);
        }
        return res;
    }
}