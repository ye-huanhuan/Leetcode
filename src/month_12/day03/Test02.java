package month_12.day03;

public class Test02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Happy");
        String res = new Solution02().replaceSpace02(sb);
        System.out.println(res);
    }
}

/**
 * 替换空格
 */
class Solution02 {
    public String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<chars.length; i++) {
            if(' ' == chars[i]) {
                res.append("%20");
            } else {
                res.append(chars[i]);
            }
        }
        return res.toString();
    }

    public String replaceSpace02(StringBuffer str) {
        StringBuilder res = new StringBuilder();
        int fromIndex = 0;
        int endIndex = 0;
        while(fromIndex < str.length()) {
            endIndex = str.indexOf(" ", fromIndex);
            if(endIndex >= 0) {
                res.append(str.substring(fromIndex,endIndex)).append("%20");
                fromIndex = endIndex + 1;
            } else {
                res.append(str.substring(fromIndex,  str.length()));
                break;
            }
        }
        return res.toString();
    }
}