package month_11.day26;

public class Test41 {
}


class Solution04 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int span = n-1;
        int num = 1;
        int flag = 0;
        int x = flag;
        int y = flag;
        while(span > 0) {
            for(int i=0; i<span; i++) res[x][y+i] = num++;
            y += span;
            for(int i=0; i<span; i++) res[x+i][y] = num++;
            x += span;
            for(int i=0; i<span; i++) res[x][y-i] = num++;
            y -= span;
            for(int i=0; i<span; i++) res[x-i][y] = num++;

            flag++;
            x = flag;
            y = flag;
            span -= 2;
        }
        if(span == 0) res[x][y] = n*n;
        return res;
    }
}