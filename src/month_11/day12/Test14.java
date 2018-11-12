package month_11.day12;

import java.util.*;

public class Test14 {
    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        boolean res = s2.lemonadeChange(new int[]{5,5,5,5,20,20,5,5,20,5});
        System.out.println(res);
    }
}

/**
 * 860. 柠檬水找零
 */
class Solution02 {
    public boolean lemonadeChange(int[] bills) {
        List<Integer> keepMoney = new ArrayList<>();
        int index = 0;
        for(int i=0; i<bills.length; i++) {
            if(bills[i] == 5) {
                keepMoney.add(5);
                keepMoney.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                });
            } else {
                int charageMoney = bills[i] - 5;
                Set<Integer> indexs = new HashSet<>();
                int j = 0;
                int flag = 0;
                for(j=keepMoney.size()-1; j>=0; j--) {
                    if(keepMoney.get(j) <= charageMoney) {
                        charageMoney -= keepMoney.get(j);
                        indexs.add(j);
                    }
                    if(charageMoney == 0) {
                        keepMoney.add(bills[i]);
                        flag = 1;
                        for(int t : indexs) {
                            keepMoney.set(t, 0);
                        }
                        keepMoney.sort(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o1 - o2;
                            }
                        });
                        break;
                    }
                }
                if(flag == 0) return false;
            }
        }
        return true;
    }
}