package month_10.day25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test51 {
}

/**
 * 存在重复元素
 */

class Solution02 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> singleNums = new HashMap<>();
        for(int num : nums) {
            if(singleNums.containsKey(num)) {
                return true;
            } else {
                singleNums.put(num,null);
            }
        }
        return false;
    }
}


