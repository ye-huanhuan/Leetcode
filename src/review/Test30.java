package review;

import javafx.scene.control.Alert;

import java.util.Arrays;

/**
 * 5021. 小于 K 的两数之和
 */
public class Test30 {

    public int twoSumLessThanK(int[] A, int K) {
        if(A.length < 1) return -1;
        int res = -1;
        Arrays.sort(A);
        int slow = 0;
        int fast = A.length - 1;
        while(slow < fast) {
            if(A[slow] + A[fast] < K) {
                res = Math.max(A[slow] + A[fast], res);
                slow++;
            } else {
                fast--;
            }
        }
        return res;
    }
}
