package month_10.day16;

public class Test22 {
}

/**
 * 最小路径和
 */
class Solution06 {
    public int minPathSum(int[][] grid) {
        int rowNum = grid.length;
        int columnNum = grid[0].length;

        for(int i=1; i<rowNum; i++) grid[i][0] += grid[i-1][0];
        for(int j=1; j<columnNum; j++) grid[0][j] += grid[0][j-1];

        for(int i=1; i<rowNum; i++) {
            for(int j=1; j<columnNum; j++) {
                grid[i][j] += Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[rowNum-1][columnNum-1];
    }
}
