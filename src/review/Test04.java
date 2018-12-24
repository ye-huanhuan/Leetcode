package review;

public class Test04 {
    //最小路径和
    public int minPathSum(int[][] grid) {
        if(grid == null) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;
        //初始化第一行
        for(int j=1; j<col; j++) {
            grid[0][j] += grid[0][j-1];
        }
        //初始化第一列
        for(int i=1; i<row; i++) {
            grid[i][0] += grid[i][0];
        }
        for(int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
            }
        }
        return grid[row-1][col-1];
    }
}
