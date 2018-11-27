package month_11.day26;

import java.util.Arrays;

public class Test36 {
    public static void main(String[] args) {

    }
}

/**
 * 945. 使数组唯一的最小增量
 */

class Solution {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int res = 0;
        for(int i=1; i<A.length; i++) {
            if(A[i] < A[i-1] + 1) {
                res += A[i-1] + 1 - A[i];
                A[i] = A[i-1] + 1;
            }
        }
        return res;
    }
}