package month_11.day29;

public class Test46 {
    public static void main(String[] args) {
        char[][] test = new char[4][5];
        test[0] = new char[]{'1','0','1','0','0'};
        test[1] = new char[]{'1','0','1','1','1'};
        test[2] = new char[]{'1','1','1','1','1'};
        test[3] = new char[]{'1','0','0','1','0'};
        Solution s = new Solution();
        int res = s.maximalSquare(test);
        System.out.println(res);
    }
}

/**
 * 最大正方形
 */
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int[][] data = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                data[i][j] = matrix[i][j] - '0';
            }
        }

        int res = Integer.MIN_VALUE;
        //初始化
        for(int i=0; i<m; i++) {
            dp[i][0] = data[i][0];
            res = Math.max(res, data[i][0]);
        }

        for(int j=0; j<n; j++) {
            dp[0][j] = data[0][j];
            res = Math.max(res, data[0][j]);
        }

        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(data[i][j] == 1) {
                    //状态转移方程
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                }
                res = Math.max(res, dp[i][j]);
            }
        }


        return res*res;
    }
}
