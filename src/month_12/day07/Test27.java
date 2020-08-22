package month_12.day07;

import java.util.ArrayList;
import java.util.Collections;

public class Test27 {
}

/**
 * 字符串的排列
 */
class Solution03 {
    public ArrayList<String> Permutation(String str) {
        if(str == null || str.length() == 0) return new ArrayList<String>();
        char[] chars = str.toCharArray();
        ArrayList<String> res = new ArrayList<>();
        exchange(chars, res, 0, chars.length);
        Collections.sort(res);
        return res;
    }

    public void exchange(char[] chars, ArrayList<String> res, int i, int len) {
        if(i == len-1) {
            String str = String.valueOf(chars);
            if(!res.contains(str)) {
                res.add(str);
            }
        }
        for(int j=i; j<len; j++) {
            swap(chars, i, j);
            exchange(chars, res, i+1, len);
            swap(chars, i, j);
        }
    }

    public void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}