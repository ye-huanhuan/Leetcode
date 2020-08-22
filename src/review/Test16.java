package review;

/**
 * 最长公共子序列
 */
public class Test16 {

    public static void main(String[] args) {
        Test16 t16 = new Test16();
        String res = t16.lcs("ABCBDAB", "BDCABA");
        System.out.println(res);
    }

    public String lcs(String a, String b) {
        char[] achars = a.toCharArray();
        char[] bchars = b.toCharArray();
        int alen = achars.length;
        int blen = bchars.length;
        int[][] dp = new int[alen+1][blen+1];
        //初始化状态矩阵
        for(int i=0; i<blen+1; i++) {
            dp[0][i] = 0;
        }
        for(int i=0; i<alen+1; i++) {
            dp[i][0] = 0;
        }

        for(int i=1; i<alen+1; i++) {
            for(int j=1; j<blen+1; j++) {
                //状态转移公式
                if(achars[i-1] == bchars[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = alen;
        int j = blen;
        while(i>0 && j>0) {
            if(achars[i-1] == bchars[j-1]) {
                sb.insert(0, achars[i-1]);
                i--;
                j--;
            } else {
                if(dp[i-1][j] > dp[i][j-1]) {
                    i = i-1;
                } else if(dp[i-1][j] < dp[i][j-1]) {
                    j = j-1;
                } else {
                    i = i-1;
                }
            }
        }
        return sb.toString();
    }
}
