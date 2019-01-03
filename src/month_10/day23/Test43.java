package month_10.day23;

public class Test43 {
    public static void main(String[] args) {
        Solution05 s5 = new Solution05();
        boolean res = s5.isPalindrome("0P");
        System.out.println(res);
    }
}

/**
 *  验证回文串
 */
class Solution05 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        if(chars.length <= 1) return true;
        int i = 0;
        int j = s.length()-1;
        while(i < j) {
            if(!Character.isLetterOrDigit(chars[i])) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(chars[j])) {
                j--;
                continue;
            }
            if(Character.isLetterOrDigit(chars[i]) && Character.isLetterOrDigit(chars[j])) {
                if(Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])){
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}