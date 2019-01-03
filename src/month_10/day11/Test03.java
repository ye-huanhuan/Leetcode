package month_10.day11;

public class Test03 {
    public static void main(String[] args) {
//        String subStr = Solution06.maxSubstring("abcdefg","adefgwgeweg");
//        System.out.println(subStr);
//        System.out.println(new Solution05().longestPalindrome("babad"));

        System.out.println(new Solution08().longestPalindrome("abacdfgdcaba"));
    }
}

/**
 * 求解最长回文子串---时间复杂度0 n3 超时
 */
class Solution05 {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return null;
        }
        if(s.length() == 1) {
            return s;
        }
        for(int i=0; i<s.length(); i++){
            for(int begin=0, end=s.length()-i; end<=s.length(); begin++, end++){
                String subStr = s.substring(begin, end);
                if(Solution07.isPalindrome(subStr)) {
                    return subStr;
                }
            }
        }
        return "";
    }
}

class Solution07 {
    public static boolean isPalindrome(String x) {
        boolean flag = true;
        for(int i=0; i<=x.length()/2; i++) {
            if(x.charAt(i) != x.charAt(x.length()-i-1)) {
                flag = false;
            }
        }
        return flag;
    }
}

/**
 * 求解最长回文子串---时间复杂度0 n2
 */
class Solution08 {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return null;
        }
        if(s.length() == 1) {
            return s;
        }
        StringBuffer sb = new StringBuffer("");
        for(int j=s.length()-1; j>=0; j--){
            sb.append(s.charAt(j));
        }
        String reverStr = sb.toString();
        String maxCommonStr = Solution06.maxSubstring(s, reverStr);
        return maxCommonStr;
    }
}

/**
 * 求解最长公共子串
 */
class Solution06{

    // 求解两个字符号的最长公共子串
    public static String maxSubstring(String strOne, String strTwo){
        // 参数检查
        if(strOne==null || strTwo == null){
            return null;
        }
        if(strOne.equals("") || strTwo.equals("")){
            return null;
        }
        // 二者中较长的字符串
        String max = "";
        // 二者中较短的字符串
        String min = "";
        if(strOne.length() < strTwo.length()){
            max = strTwo;
            min = strOne;
        } else{
            max = strTwo;
            min = strOne;
        }
        String current = "";
        // 遍历较短的字符串，并依次减少短字符串的字符数量，判断长字符是否包含该子串
        for(int i=0; i<min.length(); i++){
            for(int begin=0, end=min.length()-i; end<=min.length(); begin++, end++){
                current = min.substring(begin, end);
                if(max.contains(current)){
                    int one_index = strOne.indexOf(current);
                    int two_index = strTwo.indexOf(current);
                    String tmp = strOne.substring(one_index + current.length(), strOne.length());
                    while(tmp.contains(current)) {
                        int sub_start_index = tmp.indexOf(current);
                        one_index = tmp.indexOf(current)+ one_index + current.length();
                        tmp = strOne.substring(sub_start_index + current.length(), tmp.length());
                    }
                    if(one_index+two_index+current.length() == strOne.length()) {
                        return current;
                    }
                }
            }
        }
        return null;
    }

}

