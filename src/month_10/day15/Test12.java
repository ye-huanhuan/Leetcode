package month_10.day15;

import java.util.HashSet;
import java.util.Set;

public class Test12 {
}

/**
 * 快乐数
 */
class Solution {
    public boolean isHappy(int n) {
        Set s = new HashSet<Integer>();
        while(true) {
            int sum = 0;
            while(n != 0) {
                int tmp = n % 10;
                sum += Math.pow(tmp, 2);
                n = n/10;
            }
            if(sum == 1) return true;
            if(s.contains(sum)) {
                return false;
            } else {
                s.add(sum);
            }
            n = sum;
        }
    }
}
