package month_10.day26;

public class Test54 {
}

/**
 * 反转字符串
 */
class Solution02 {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        char tmp = ' ';
        for(int i=chars.length-1,j=0; i>j; i--,j++) {
            tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }
        return new String(chars);
    }
}