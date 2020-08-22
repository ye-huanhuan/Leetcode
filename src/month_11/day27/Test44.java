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
 */
class Solution03 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        boolean res = s3.checkInclusion02("adc", "dcda");
        System.out.println(res);
    }
    // 超时
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int len = s1.length();
        int end = len - 1;
        for(char c : s1.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        while(end < s2.length()) {
            boolean flag = true;
            for(int i=start; i<=end; i++) {
                if(!map.containsKey(s2.charAt(i)) || (map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i)) == 0)) {
                    flag = false;
                    break;
                } else{
                    map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
                }
            }

            if(flag) {
                return flag;
            }
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
    //滑动窗口
    public boolean checkInclusion02(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return false;
        }
        int[] x = new int[26];
        int[] y = new int[26];
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int i=0;
        for(; i<s1.length(); i++) {
            x[chars1[i] - 'a'] ++;
            y[chars2[i] - 'a'] ++;
        }

        for(int j=i; j<s2.length(); j++) {
            if(isSame(x, y)) {
                return true;
            }
            y[chars2[j-i] - 'a']--;
            y[chars2[j] - 'a']++;
        }
        return isSame(x, y);
    }

    public boolean isSame(int[] a, int[] b) {
        for(int i=0; i<26; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}