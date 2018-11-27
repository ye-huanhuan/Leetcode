package month_11.day27;

import java.util.HashMap;
import java.util.Map;

public class Test43 {
    public static void main(String[] args) {
        String str = "abba";
        Solution02 s2 = new Solution02();
        int res = s2.lengthOfLongestSubstring(str);
        System.out.println(res);
    }
}

/**
 * 无重复字符的最长子串
 */
class Solution02 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int res = 0;
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                //因为当移动left的时候没有将left之前的元素从map中移除，后来可能还会出现；所以要取max
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}