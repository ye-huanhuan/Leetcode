package interview;

import java.util.Arrays;

/**
 * 在一个二维的花园中，有一些用 (x, y) 坐标表示的树。
 * 由于安装费用十分昂贵，你的任务是先用最短的绳子围起所有的树。
 * 只有当所有的树都被绳子包围时，花园才能围好栅栏。
 * 你需要找到正好位于栅栏边界上的树的坐标。
 */
public class Test03 {
    public static void main(String[] args) {
        int[][] test = {{1, 1},{2,2},{2,0},{2,4},{3,3},{4,2}};
        Test03 t3 = new Test03();
        t3.outerTrees(test);
    }
    public int[][] outerTrees(int[][] points) {
        return null;
    }
}
