package leetcode;
/**
 * DATE: 2020/8/22
 * DESCRIPTION: 不同路径 II
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * CREATE BY: yehuanhuan
 */
public class Solution63 {
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
