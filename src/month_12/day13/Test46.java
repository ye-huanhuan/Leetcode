package month_12.day13;

import java.util.ArrayList;
import java.util.List;

public class Test46 {
}

/**
 * 孩子们的游戏(圆圈中最后剩下的数)
 */
class Solution04 {
    public int LastRemaining_Solution(int n, int m) {
        List<Integer> childrens = new ArrayList<>();
        for(int i=0; i<n; i++) {
            childrens.add(i);
        }
        int start = 0;
        while(childrens.size() > 1) {
            start = (start + m - 1) % childrens.size();
            childrens.remove(start);
        }
        return childrens.size() == 1 ? childrens.get(0) : -1;

    }
}