package month_11.day27;

import java.util.HashMap;
import java.util.Map;

public class Test44 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        boolean res = s3.checkInclusion("ab", "eidbaooo");
        System.out.println(res);
    }
}

/**
 * 字符串的排列
 * 超时
 */
class Solution03 {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int len = s1.length();
        int end = len - 1;
        for(char c : s1.toCharArray()) {
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        while(end < s2.length()) {
            int flag = 1;
            for(int i=start; i<=end; i++) {
                if(!map.containsKey(s2.charAt(i))) {
                    flag = 0;
                    break;
                } else {
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
                }
            }
            int flag2 = 1;
            if(flag == 1) {
                for(Character c : map.keySet()) {
                    if(map.get(c) != 0) flag2 = 0;
                }
            }
            if(flag2 == 1 && flag == 1) return true;
            map.clear();
            for(char c : s1.toCharArray()) {
                if(map.containsKey(c)) map.put(c, map.get(c) + 1);
                else map.put(c, 1);
            }
            start++;
            end++;
        }
        return false;
    }
}