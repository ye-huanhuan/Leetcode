package month_10.day17;

import java.util.ArrayList;
import java.util.List;

public class Test24 {
}

/**
 * 划分字母区间
 */
class Solution02 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        char[] chars = S.toCharArray();
        int start = 0;
        int end = 0;
        while(end <= chars.length) {
            for(int i=start; i<=end; i++) {
                for(int j=end + 1; j<chars.length; j++) {
                    if(chars[i] == chars[j]) end = j;
                }
            }
            res.add(end-start + 1);
            start = end + 1;
            end = start;
        }
        return res;
    }
}
