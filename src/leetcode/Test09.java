package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Test09 {
    /**
     * 重复N次的元素
     * @param A
     * @return
     */
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>(A.length/2 + 1);
        for(int a : A) {
            if(!set.add(a)) {
                return a;
            }
        }
        return -1;
    }
}
