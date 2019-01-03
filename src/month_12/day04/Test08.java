package month_12.day04;

public class Test08 {
    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        int res = s2.JumpFloor(2);
        System.out.println(res);
    }
}

/**
 * 跳台阶
 */
class Solution02 {
    public int JumpFloor(int target) {
        if(target == 0) {
            return 1;
        }
        if(target == -1) {
            return 0;
        }
        return JumpFloor(target-1) + JumpFloor(target-2);
    }
}