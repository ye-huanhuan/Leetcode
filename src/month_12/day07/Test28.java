package month_12.day07;

public class Test28 {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,2,6,2,3,2,2,2,2,5,2,2};
        Solution04 s4 = new Solution04();
        int res = s4.MoreThanHalfNum_Solution(test);
        System.out.println(res);
    }
}

/**
 * 数组中出现次数超过一半的数字
 */
class Solution04 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 0;
        int cur = 0;
        for(int i : array) {
            if(count == 0) {
                cur = i;
            }
            if(i == cur) {
                count++;
            }else {
                count--;
            }
        }
        count = 0;
        for(int i : array) {
            if(i == cur) {
                count++;
            }
        }
        return count > array.length/2 ? cur : 0;
    }
}