package month_11.day22;

public class Test35 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,3,2,1};
        Solution03 s3 = new Solution03();
        boolean res = s3.validMountainArray(nums);
        System.out.println(res);
    }
}

/**
 * 941. 有效的山脉数组
 */
class Solution03 {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;
        if(A[0] > A[1]) return false;
        int flag = 0;
        for(int i=1; i<A.length; i++) {
            if(A[i] == A[i-1]) return false;
            if(A[i] < A[i-1]) {
                flag = 1;
            }
            if(A[i] > A[i-1] && flag == 1) {
                return false;
            }
            if(A[i] < A[i-1] && flag == 0) {
                return false;
            }
        }
        return flag == 1 ? true : false;
    }
}