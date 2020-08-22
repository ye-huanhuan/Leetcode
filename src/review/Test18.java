package review;

/**
 * 329.判断子序列
 */
public class Test18 {
    public boolean isSubsequence(String s, String t) {

        int si = 0;
        int ti = 0;
        while(si < s.length() && ti < t.length()) {
            if(s.charAt(si) == t.charAt(ti)) {
                si++;
            }
            ti++;
        }
        return si == s.length();
    }
}
