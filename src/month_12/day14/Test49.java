package month_12.day14;

public class Test49 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.StrToInt("-23432");
        System.out.println(res);
    }
}

/**
 * 把字符串转换成整数
 */
class Solution {
    public int StrToInt(String str) {
        if(str == "" || str.length() == 0) return 0;
        char[] chars = str.toCharArray();
        int res = 0;
        int fuhao = 0;
        int zhenghao = 0;
        if(chars[0] == '-') {
            fuhao = 1;
        } else if(chars[0] == '+') {
            zhenghao = 1;
        }
        for(int i=Math.max(zhenghao, fuhao); i<chars.length; i++) {
            if(chars[i] > 57 || chars[i] < 48) {
                return 0;
            }
            res = res*10 + chars[i] - 48;
        }
        return fuhao == 1 ? res * -1 : res;
    }
}