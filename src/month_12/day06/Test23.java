package month_12.day06;

public class Test23 {
    public static void main(String[] args) {
        int[] test = new int[]{2,3,1,4,7,5};
        Solution05 s5 = new Solution05();
        boolean res = s5.VerifySquenceOfBST(test);
        System.out.println(res);
    }
}

class Solution05 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) return false;
        return verifyBST(sequence, 0, sequence.length-1);
    }

    public boolean verifyBST(int [] sequence, int start, int end) {
        //出口
        if(start >= end) {
            return true;
        }
        int root = sequence[end];
        int i=start;
        for( ;i<=end; i++) {
            if(sequence[i] >= root) {
                break;
            }
        }
        //出口
        for(int j=i;j<=end; j++) {
            if(sequence[j] < root) {
                return false;
            }
        }
        boolean left = true;

        left = verifyBST(sequence, start, i-1);

        boolean right = true;

        right = verifyBST(sequence, i, end-1);

        return left & right;
    }
}
