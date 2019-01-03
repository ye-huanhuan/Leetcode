package month_12.day10;

import java.util.ArrayList;

public class Test41 {
    public static void main(String[] args) {
        Solution05 s5 = new Solution05();
        ArrayList<ArrayList<Integer>> res = s5.FindContinuousSequence(100);
        for(int i=0; i<res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}

/**
 * 和为S的连续正数序列
 */
class Solution05 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low = 1;
        int high = 2;

        while(low < high) {
            int cur = (low + high) * (high - low +1) / 2;
            if(cur == sum) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for(int i=low; i<=high; i++) {
                    tmp.add(i);
                }
                res.add(tmp);
                low++;
            } else if(cur < sum) {
                high++;
            } else {
                low++;
            }
        }
        return res;
    }
}