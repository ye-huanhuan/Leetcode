package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test16 {

    public static void main(String[] args) {
        Test16 t16 = new Test16();
        t16.grayCode(2);
    }

//    89.格雷编码
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();

        if(n == 1) {
            res.add(0,0);
            res.add(1,1);
        }

        List<Integer> last = grayCode(n-1);
        for(int i=0; i<last.size(); i++) {
            res.add(i,last.get(i));
            res.add(res.size()-i-1,Integer.valueOf("1" + Integer.toBinaryString(last.get(i))));
        }
        return res;
    }
}
