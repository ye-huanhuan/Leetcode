package month_10.day29;

import org.omg.PortableInterceptor.INACTIVE;

public class Test56 {
}

/**
 * 931. 下降路径最小和
 */
class Solution02 {
    public int minFallingPathSum(int[][] A) {
        for(int i=1; i<A.length; i++) {
           for(int j=0; j<A[0].length; j++) {
               int left = Integer.MAX_VALUE;
               if(j>0) {
                   left = A[i-1][j-1];
               }
               int mid = A[i-1][j];
               int right = Integer.MAX_VALUE;
               if(j<A[0].length-1) {
                   right = A[i-1][j+1];
               }
               A[i][j] += Math.min(Math.min(left,mid),right);
           }
        }
        int res = Integer.MAX_VALUE;
        for(int index=0; index<A[0].length; index++) {
            if(A[A.length-1][index] < res) res = A[A.length-1][index];
        }
        return res;
    }
}
