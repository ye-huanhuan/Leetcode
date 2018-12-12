package month_12.day10;

import java.util.ArrayList;

public class Test42 {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,4,6,8,10};
        Solution06 s6 = new Solution06();
        ArrayList<Integer> res = s6.FindNumbersWithSum(test, 10);
        System.out.println(res.get(0) + "  " + res.get(1));

    }
}

/**
 * 和为S的两个数字
 */
class Solution06 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if(array == null || array.length == 0) return res;
        int low = 0;
        int high = array.length-1;
        int tmp = 0;
        res.add(Integer.MAX_VALUE);
        res.add(1);
        while(low < high) {
            tmp = array[low] + array[high];
            if(tmp == sum) {
                if(res.get(0) * res.get(1) >= array[low]*array[high]) {
                    res.set(0, array[low]);
                    res.set(1, array[high]);
                    low ++;
                    high--;
                } else {
                    low++;
                    high--;
                }
            } else if(tmp < sum) {
                low++;
            } else {
                high--;
            }
        }
        if(res.get(0) == Integer.MAX_VALUE) {
            res.remove(0);
            res.remove(1);
        }
        return res;
    }
}