package month_11.day28;

public class Test45 {

    public static void main(String[] args) {
        String str = "   a   b ";
        Solution s = new Solution();
        String res = s.reverseWords(str);
        System.out.println(res);
    }
}

/**
 * 翻转字符串里的单词
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strs = s.split(" ");
        for(int i=strs.length-1; i>=0; i--) {
            if(!"".equals(strs[i])) {
                sb.append(strs[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}