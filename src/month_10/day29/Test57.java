package month_10.day29;

public class Test57 {

    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        int res = s3.numSubarraysWithSum(new int[]{0,0,0,0,0}, 0);
        System.out.println(res);
        int res2 = s3.numSubarraysWithSum(new int[]{1,0,1,0,1}, 2);
        System.out.println(res2);
    }
}


/**
 * 930. 和相同的二元子数组
 */
class Solution03 {

    public int numSubarraysWithSum(int[] A, int S) {

        int res = 0;
        int sum = 0;
        for(int i=0; i<A.length; i++) {
            sum = 0;
            for(int j=i; j<A.length; j++) {
                sum += A[j];
                if(sum == S) {
                    res++;
                }
                if(sum > S) {
                    break;
                }
            }
        }
        return res;
    }

    public int numSubarraysWithSum02(int[] A, int S) {

        int res = 0;
        int sum = 0;
        for(int i=0; i<A.length; i++) {
            sum = 0;
            for(int j=i; j<A.length; j++) {
                sum += A[j];
                if(sum == S) {
                   res++;
                }
                if(sum > S) {
                    break;
                }
            }
        }
        return res;
    }
}