package month_12.day04;

public class Test09 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        int res = s3.JumpFloorII(2);
        System.out.println(res);
    }
}

/**
 * 变态跳台阶
 */
class Solution03 {
    public int JumpFloorII(int target) {
        if(target == -1) {
            return 0;
        }
        if(target == 0) {
            return 1;
        }
        int sum = 0;
        for(int i=0; i<target; i++) {
            sum += JumpFloorII(i);
        }
        return sum;
    }
}