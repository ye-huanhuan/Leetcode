package month_12.day05;

public class Test13 {
    public static void main(String[] args) {
        int[] test = new int[]{4,3,2,7,10,5};
        Solution s = new Solution();
        s.reOrderArray(test);
        for (int i : test) {
            System.out.println(i);
        }
    }
}

/**
 * 调整数组顺序使奇数位于偶数前面
 */
class Solution {
    public void reOrderArray(int [] array) {
        int tmp = -1;
        for(int i=0; i<array.length; i++) {
            if(array[i]%2 == 0) {
                for(int j=i+1; j<array.length; j++) {
                     if(array[j]%2 != 0){
                        for(int n=j; n>i; n--) {
                            tmp = array[n-1];
                            array[n-1] = array[n];
                            array[n] = tmp;
                        }
                        break;
                     }
                }
            }
        }
    }
}