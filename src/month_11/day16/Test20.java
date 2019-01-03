package month_11.day16;

import java.util.Arrays;

public class Test20 {

    public static void main(String[] args) {
        Solution s = new Solution();
        String res = s.countAndSay(6);
        System.out.println(res);
    }
}

/**
 * 38. 报数
 */
class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        StringBuilder init = new StringBuilder("1");
        StringBuilder res = new StringBuilder("");
        for(int i=1; i<n; i++) {
            res.delete(0, res.capacity());
            char[] chars = init.toString().toCharArray();
            char tmp = ' ';
            if(chars.length > 0) {
                tmp = chars[0];
            }
            int count = 0;
            for(int j=0; j<chars.length; j++) {
                if(chars[j] == tmp) {
                    count++;
                } else {
                    res.append(count);
                    res.append(tmp);
                    count = 1;
                    tmp = chars[j];
                }

            }
            res.append(count);
            res.append(tmp);
            init.delete(0,init.capacity());

            for(char c : res.toString().toCharArray()) {
                init.append(c);
            }
        }
        return res.toString();
    }
}