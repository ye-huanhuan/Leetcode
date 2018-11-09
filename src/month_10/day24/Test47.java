package month_10.day24;

import java.util.LinkedList;
import java.util.Queue;

public class Test47 {

    public static void main(String[] args) {
    }
}

class Solution {

    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;

        int res = 0;
//        int rowNum = grid.length;
//        int coluNum = grid[0].length;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                if(grid[i][j] != '0'){
                    searchWithBFS(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private class Cell{
        int row;
        int col;
        public Cell(int i,int j){
            row=i;
            col=j;
        }
    }
    public void searchWithBFS(char[][] grid,int i,int j){
        Queue<Cell> queue=new LinkedList<Cell>();
        queue.add(new Cell(i,j));
        grid[i][j]='0';
        int[][] directions=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};//下右上左
        while(!queue.isEmpty()){
            Cell start=queue.poll();
            for(int k=0;k<=3;k++){
                int x=start.row+directions[k][0];
                int y=start.col+directions[k][1];
                if(x<0 || x==grid.length || y<0 || y==grid[0].length || grid[x][y]=='0'){
                    continue;
                }
                queue.add(new Cell(x,y));
                grid[x][y]='0';
            }
        }
    }

    public void bfSearch(char[][] grid, int i, int j, int rowNum, int coluNum) {

        Queue<int[]> charQueue = new LinkedList<>();
        charQueue.offer(new int[]{i, j});
        while(!charQueue.isEmpty()) {
            int[] tmp = charQueue.poll();
            i = tmp[0];
            j = tmp[1];
            grid[i][j] = '0';
            if(i > 0 && grid[i-1][j] != '0'){
                charQueue.offer(new int[]{i-1,j});
            }
            if(i < rowNum-1 && grid[i+1][j] != '0') {
                charQueue.offer(new int[]{i+1,j});
            }
            if(j > 0 && grid[i][j-1] != '0') {
                charQueue.offer(new int[]{i,j-1});
            }
            if(j < coluNum-1 && grid[i][j+1] != '0') {
                charQueue.offer(new int[]{i,j+1});
            }
        }
    }

}
