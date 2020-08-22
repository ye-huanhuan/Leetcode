package bishi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main10 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    private static int result = 0;
    public static int longpath(int[][] matrix) {
        if(matrix.length == 0){
            return result;
        }
        int[][] dp = new int[matrix.length][matrix[0].length];
        //计算每个节点作为结束节点的长度
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dp_methor(matrix, i, j, Integer.MIN_VALUE, dp);
            }
        }
        return result;
    }

    public static int dp_methor(int[][] matrix, int start, int end, int target, int[][] dp) {
        int curr = matrix[start][end];
        if (dp[start][end] != 0 && curr > target) {
            return dp[start][end];
        }
        //非递减
        if (curr <= target) {
            return 0;
        }
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        // 不在第一行时可以往上
        if (start != 0) {
            up = dp_methor(matrix, start - 1, end, curr, dp);
        }
        // 不在最后一列可以往右
        if (end != matrix[0].length - 1) {
            right = dp_methor(matrix, start, end + 1, curr, dp);
        }
        // 不在最后一行可以往下
        if (start != matrix.length - 1) {
            down = dp_methor(matrix, start + 1, end, curr, dp);
        }
        // 不在第一列可以往左
        if (end != 0) {
            left = dp_methor(matrix, start, end - 1, curr, dp);
        }
        dp[start][end] = Math.max(Math.max(up, down), Math.max(left, right)) + 1;
        //实时更新result
        result = Math.max(result, dp[start][end]);
        return dp[start][end];
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _matrix_rows = 0;
        int _matrix_cols = 0;
        _matrix_rows = Integer.parseInt(in.nextLine().trim());
        _matrix_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _matrix = new int[_matrix_rows][_matrix_cols];
        for(int _matrix_i=0; _matrix_i<_matrix_rows; _matrix_i++) {
            for(int _matrix_j=0; _matrix_j<_matrix_cols; _matrix_j++) {
                _matrix[_matrix_i][_matrix_j] = in.nextInt();
            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = longpath(_matrix);
        System.out.println(String.valueOf(res));

    }
}
