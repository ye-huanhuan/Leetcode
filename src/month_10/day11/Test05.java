package month_10.day11;

public class Test05 {
    public static void main(String[] args) {
        System.out.println(new Solution11().uniquePaths(7,3));
    }
}

/**
 * 不同路径
 */
class Solution11 {
    public int uniquePaths(int m, int n) {
        int[][] route = new int[n][m];

        for(int i=0; i<n; i++) {
            route[i][0] = 1;
        }
        for(int j=0; j<m; j++) {
            route[0][j] = 1;
        }

        for(int i=1; i<n; i++) {
            for(int j=1; j<m; j++) {
                route[i][j] = route[i-1][j] + route[i][j-1];
            }
        }
        return route[n-1][m-1];
    }
}


class Solution12 {
    private int [][]memo;

    public int uniquePaths2(int m, int n) {
        memo = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(i == 0 && j == 0) memo[m][n] = 1;

                if(i >= 1 && j >= 1) memo[i][j] = 0;
            }
        }
        return memo[m-1][n-1];
    }


    public int uniquePaths(int m, int n) {
        if(m <= 1 || n <= 1) return 1;
        memo = new int[m][n];
        return pathCount(0,0,m-1,n-1);
    }

    private int pathCount(int x, int y,int h ,int s){
        if(memo[x][y] > 0) return memo[x][y];
        if(x == h && y == s){
            return 1;
        }
        int res = memo[x][y];
        if(x + 1 <= h){
            res += pathCount(x + 1,y,h,s);
        }
        if(y + 1 <= s){
            res += pathCount(x,y + 1,h,s);
        }
        memo[x][y] = res;
        return res;
    }
}
