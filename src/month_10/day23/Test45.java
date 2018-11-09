package month_10.day23;

public class Test45 {
}

/**
 * 盛最多水的容器
 */
class Solution07 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = (j-i) * Math.min(height[i],height[j]);
        while(i<=j) {
            int tmp = (j-i) * Math.min(height[i],height[j]);
            if(tmp >= max) {
                max = tmp;
            }
            if(height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return max;
    }
}
