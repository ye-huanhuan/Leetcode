package leetcode;

public class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        if(grid.length <= 0) {
            return ans;
        }
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 0) continue;
                ans = Math.max(dfs(grid, i, j), ans);
            }
        }
        return ans;
    }

    public int dfs(int[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        return 1 + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i+1, j) + dfs(grid, i, j-1);
    }
}
