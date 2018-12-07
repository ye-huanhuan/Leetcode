package month_12.day08;

import java.util.Arrays;
import java.util.Comparator;

public class Test32 {

    public static void main(String[] args) {
        int[] test = new int[]{3, 32, 321};
        Solution02 s2 = new Solution02();
        String res = s2.PrintMinNumber(test);
        System.out.println(res);
    }

}

/**
 * 把数组排成最小的数
 */
class Solution02 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers == null || numbers.length == 0) {
            return "";
        }
        String[] strs = new String[numbers.length];
        int index = 0;
        StringBuilder res = new StringBuilder();
        for(int i : numbers) {
            strs[index++] = String.valueOf(i);
        }
//        Arrays.sort(strs, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int m = Integer.valueOf(o1 + o2);
//                int n = Integer.valueOf(o2 + o1);
//                return m - n;
//            }
//        });
        Arrays.sort(strs, ((o1, o2) -> Integer.valueOf(o1+o2) - Integer.valueOf(o2+o1)));

        for(String str : strs) {
            res.append(str);
        }
        return res.toString();
    }
}