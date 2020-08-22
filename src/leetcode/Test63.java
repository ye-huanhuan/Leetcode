package leetcode;

public class Test63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                if(i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = (i>0 ? dp[i-1][j] : 0) + (j>0 ? dp[i][j-1] : 0);
            }
        }
        return dp[m-1][n-1];
    }
    public int uniquePathsWithObstacles02(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        //使用滚动数组只需要保存一行的状态
        dp[0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                    continue;
                }
                dp[j] = (j>0 ? dp[j-1] : 0) + dp[j];
            }
        }
        return dp[n-1];
    }
    public int uniquePathsWithObstacles03(int[][] obstacleGrid) {
        return help(obstacleGrid, obstacleGrid.length-1, obstacleGrid[0].length-1);
    }
    public int help(int[][] obstacleGrid, int i, int j) {
        if(i<0 || j<0 || obstacleGrid[i][j] == 1) {
            return 0;
        }
        if(i == 0 && j == 0) {
            return 1;
        }
        return help(obstacleGrid, i-1, j) + help(obstacleGrid, i, j-1);
    }
}
