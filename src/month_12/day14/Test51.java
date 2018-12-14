package month_12.day14;

public class Test51 {
    public static void main(String[] args) {
        int[] test = new int[]{2,3,5,2};
        Solution03 s3 = new Solution03();
        int[] res = s3.multiply(test);
        System.out.println(res[0]);
    }
}

/**
 * 构建乘积数组
 */
class Solution03 {
    public int[] multiply(int[] A) {
        if(A == null) return null;
        int len = A.length;
        int[] res = new int[len];
        int[] forward = new int[len];
        forward[0] = 1;
        int[] reverse = new int[len];
        reverse[0] = 1;
        for(int i=1; i<len; i++) {
            forward[i] = forward[i-1] * A[i-1];
            reverse[i] = reverse[i-1] * A[len-i];
        }
        for(int i=0; i<res.length; i++) {
            res[i] = forward[i] * reverse[len-i-1];
        }
        return res;
    }
}