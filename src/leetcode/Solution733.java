package leetcode;

/**
 * DATE: 2020/8/22
 * DESCRIPTION: 图像渲染
 * 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。
 * 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。
 * 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。
 * 最后返回经过上色渲染后的图像。
 * CREATE BY: yehuanhuan
 */
public class Solution733 {
    private int initColor;
    private int newColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        this.initColor = image[sr][sc];
        this.newColor = newColor;
        if(initColor == newColor) return image;
        dfs(image, sr, sc);
        return image;
    }

    public void dfs(int[][] image, int i, int j) {
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j] != initColor) {
            return;
        }
        image[i][j] = newColor;
        dfs(image, i-1, j);
        dfs(image, i, j+1);
        dfs(image, i+1, j);
        dfs(image, i, j-1);
    }
}
