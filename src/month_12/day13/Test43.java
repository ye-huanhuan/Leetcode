package month_12.day13;

public class Test43 {
    public static void main(String[] args) {
        String str = "abcdefg";
        Solution s = new Solution();
        String res = s.LeftRotateString(str, 2);
        System.out.println(res);
    }
}

/**
 * 左旋转字符串
 */

class Solution {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if(len == 0) return "";
        n %= len;
        str += str;
        return str.substring(n,len+n);
    }
}