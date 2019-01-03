package month_10.day22;

public class Test35 {

    public static void main(String[] args) {
        Solution07 s7 = new Solution07();
        boolean x = s7.isMonotonic(new int[]{1,3,2});
        System.out.println(x);
    }
}

/**
 * 896.单调数列
 */

class Solution07 {
    public boolean isMonotonic(int[] A) {

        for(int i=0; i<A.length-1; i++) {
            int preNum = 0;
            int tmp = Integer.compare(A[i], A[i+1]);
            if(tmp != 0) {
                if(tmp != preNum && preNum != 0) return false;
                preNum = tmp;
            }
        }
        return true;
    }
}