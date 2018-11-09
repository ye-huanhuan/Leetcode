package month_10.day23;

import java.util.ArrayList;
import java.util.List;

public class Test44 {
}

/**
 * 反转字符串中的元音字母
 *
 */
class Solution06 {
    public String reverseVowels(String s) {
        List<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('e');
        chars.add('i');
        chars.add('o');
        chars.add('u');
        chars.add('A');
        chars.add('E');
        chars.add('I');
        chars.add('O');
        chars.add('U');
        char[] souChars = s.toCharArray();
        int i = 0;
        int j = souChars.length-1;
        while(i < j) {
            if(chars.contains(souChars[i]) && chars.contains(souChars[j])) {
                char tmp = souChars[i];
                souChars[i] = souChars[j];
                souChars[j] = tmp;
                i++;
                j--;
            } else if(chars.contains(souChars[i]) && !chars.contains(souChars[j])) {
                j--;
            } else if(!chars.contains(souChars[i]) && chars.contains(souChars[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return new String(souChars);
    }
}