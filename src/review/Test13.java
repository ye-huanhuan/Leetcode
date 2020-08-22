package review;

import java.util.Arrays;

/**
 *  1051. 高度检查器
 */
public class Test13 {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] tmp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        for(int i=0; i<tmp.length; i++) {
            if(tmp[i] != heights[i]) {
                res++;
            }
        }
        return res;
    }
}
