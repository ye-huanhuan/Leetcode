package month_11.day19;

public class Test23 {
    public static void main(String[] args) {

    }
}

/**
 * 867. 转置矩阵
 */
class Solution {
    public int[][] transpose(int[][] A) {
        int rowLen = A.length;
        int columnLen = A[0].length;
        int[][] res = new int[columnLen][rowLen];
        for(int i=0; i<rowLen; i++) {
            for(int j=0; j<columnLen; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}