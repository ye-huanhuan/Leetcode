package review;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1091. 二进制矩阵中的最短路径
 * 使用广搜（bdf）寻找最短路径
 */
public class Test26 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        //注意特殊值
        if(grid[0][0] != 0) return -1;
        int level = 1;
        int len = grid.length;
        Queue<Point> qu = new LinkedList<>();
        int[] xv = {-1,0,1,1,1,0,-1,-1};
        int[] yv = {-1,-1,-1,0,1,1,1,0};
        qu.add(new Point(0,0));
        while(!qu.isEmpty()) {
            int size = qu.size();
            level++;

            for(int i=0; i<size; i++) {
                Point head = qu.poll();
                for(int j=0; j<xv.length; j++) {
                    int x = head.getX() + xv[j];
                    int y = head.getY() + yv[j];
                    if(x<0 || x>=len || y<0 || y>=len || grid[x][y] > 0) {
                        continue;
                    }
                    qu.add(new Point(x, y));
                    //剪枝，访问过的不要再回去，否则会队列永远不为空
                    grid[x][y] = 2;
                    if(x == len-1 && y == len-1) {
                        return level;
                    }
                }


            }
        }
        return -1;
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}