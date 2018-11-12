package month_11.day07;

public class Test08 {

    public static void main(String[] args) {
        Solution s = new Solution();
        String str = s.longestCommonPrefix(new String[]{"aa","a"});
        System.out.println(str);
    }
}

/**
 * 14. 最长公共前缀
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len == 0) return "";
        if(len == 1) return strs[0];
        int strLen = strs[0].length();
        int i=1;
        for(; i<=strLen; i++) {
            String tmp = strs[0].substring(0,i);
            for(int j=1; j<len; j++) {
                if(i > strs[j].length()) return strs[j];
                if(!tmp.equals(strs[j].substring(0,i))) {
                    if(i==1) return "";
                    return strs[0].substring(0,i-1);
                }
            }
        }
        if(i==strLen) return strs[0];
        return "";
    }
}