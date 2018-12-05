package month_12.day06;

import java.util.ArrayList;
import java.util.List;

public class Test19 {
    public static void main(String[] args) {
        int[][] test = new int[5][5];
        int x = 1;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                test[i][j] = x++;
            }
        }
        Solution s = new Solution();
        List<Integer> res = s.printMatrix(test);
        for(int i : res) {
            System.out.println(i);
        }
    }
}

/**
 * 顺时针打印矩阵
 */
class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix.length == 0 ||(matrix.length == 1 && matrix[0].length == 0)){
            return res;
        }
        int start=0;
        int rowNum = matrix.length;
        int columnNum = matrix[0].length;
        while(start*2<rowNum && start*2<columnNum){
            runOneCircle(res, matrix, rowNum, columnNum, start);
            start++;
        }
        return res;
    }

    public void runOneCircle(List<Integer> res, int[][] matrix, int rowNum, int columnNum, int start) {
        int endX = rowNum-start-1;
        int endY = columnNum-start-1;
        for(int j=start; j<=endY; j++) {
            res.add(matrix[start][j]);
        }
        if(endX > start) {
            for(int i=start+1; i<=endX; i++) {
                res.add(matrix[i][endY]);
            }
        }
        if(start<endY && start < endX) {
            for(int j=endY-1; j>=start; j--) {
                res.add(matrix[endX][j]);
            }
        }
        if(start<endX-1 && start<endY) {
            for(int i=endX-1; i>=start+1; i--) {
                res.add(matrix[i][start]);
            }
        }
    }
}