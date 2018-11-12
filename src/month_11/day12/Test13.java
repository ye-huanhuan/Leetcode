package month_11.day12;

public class Test13 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.findContentChildren(new int[]{1,2}, new int[]{1,2,3});
        System.out.println(res);
    }
}

/**
 * 455. 分发饼干
 *  贪心算法求解
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        for(int i=0; i<g.length; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j=0; j<s.length; j++) {
                //该饼干分配出去了
                if(s[j] == -1) continue;
                int sub = s[j] - g[i];
                //子问题的最优解为饼干尺寸大于且最接近孩子胃口值
                if(sub >= 0 && sub <= min) {
                    min = sub;
                    index = j;
                }
            }
            if(index != -1) {
                s[index] = -1;
                res++;
            }
        }
        return res;
    }
}
