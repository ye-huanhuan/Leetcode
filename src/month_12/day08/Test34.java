package month_12.day08;

import java.util.HashMap;
import java.util.Map;

public class Test34 {
    public static void main(String[] args) {
        String test = new String("googgle");
        Solution04 s4 = new Solution04();
        int res = s4.FirstNotRepeatingChar(test);
        System.out.println(res);
    }
}

/**
 * 第一个只出现一次的字符
 */
class Solution04 {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i=0;i<chars.length; i++) {
            if(map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}