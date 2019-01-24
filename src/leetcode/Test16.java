package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test16 {

    public static void main(String[] args) {
        Test16 t16 = new Test16();
        List<Integer> res = t16.grayCode(2);
        for(int i=0; i<res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

//    89.格雷编码
    public List<Integer> grayCode(int n) {
        int capcity = (int)Math.pow(2, n);
        List<Integer> res = new ArrayList<>(capcity);

        if(n == 1) {
            res.add(0,0);
            res.add(1,1);
            return res;
        }

        List<Integer> last = grayCode(n-1);
        for(int i=0; i<last.size(); i++) {
            res.add(i,last.get(i));
            res.add(capcity-i-1, Integer.parseInt("1" + Integer.toBinaryString(last.get(i)),2));
        }
        return res;
    }
}
