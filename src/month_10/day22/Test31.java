package month_10.day22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test31 {
}


/**
 * 只出现一次的数字
 * 实现思路：
 *  1、使用hashMap增删操作，不存在就增加，存在就删除
 *  2、使用位运算，把所有的数进行异或操作
 */
class Solution03 {
    public int singleNumber02(int[] nums) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int num : nums) {
            if(numMap.containsKey(num)) numMap.remove(num);
            else numMap.put(num, null);
        }
        Iterator<Integer> iter = numMap.keySet().iterator();
        return iter.next();
    }

    public int singleNumber(int[] nums) {
        int tmp = 0;
        for(int num : nums) {
            tmp = tmp^num;
        }
        return tmp;
    }
}