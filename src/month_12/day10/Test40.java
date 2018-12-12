package month_12.day10;

public class Test40 {
    public static void main(String[] args) {
        Solution04 s4 = new Solution04();
        int[] test = new int[]{1,2,3,1,5,2,6,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        s4.FindNumsAppearOnce(test, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}

/**
 * 数组中只出现一次的数字
 */
class Solution04 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length < 2) return;
        int tmp = 0;
        int index = 0;
        for(int a : array) {
            tmp = tmp^a;
        }
        while((tmp&1) == 0) {
            tmp = tmp >> 1;
            index++;
        }
        num1[0] = 0;
        num2[0] = 0;
        for(int i : array) {
            if(isOne(i, index)) {
                num1[0] = num1[0] ^ i;
            } else {
                num2[0] = num2[0] ^ i;
            }
        }
    }

    public boolean isOne(int num, int index) {
        return ((num >> index) & 1) == 0;
    }
}