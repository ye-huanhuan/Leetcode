package month_11.day22;

public class Test34 {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        Solution02 s2 = new Solution02();
        int res = s2.strStr(haystack, needle);
        System.out.println(res);
    }
}

/**
 * 28. 实现strStr()
 */
class Solution02 {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if(len == 0) return 0;
        int start = 0;
        int end = len;
        while(end <= haystack.length()) {
            String tmp = haystack.substring(start, end);
            if(needle.equals(tmp)) {
                return start;
            }
            start++;
            end++;
        }
        return -1;
    }
}