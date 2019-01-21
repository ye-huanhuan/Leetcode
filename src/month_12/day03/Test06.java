package month_12.day03;

public class Test06 {
    public static void main(String[] args) {
        int[] test = new int[]{3,4,5,1,2};
        Solution06 s6 = new Solution06();
        int res = s6.minNumberInRotateArray(test);
        System.out.println(res);
    }
}

/**
 * 旋转数组的最小数字
 * 思路：变形版的二分查找
 */

class Solution06 {
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length-1;
        int mid = left;
        while(array[left] >= array[right]) {
            mid = (right+left)/2;

            if(right - left == 1) {
                mid = right;
                break;
            }

            //特殊情况，就是出现重复元素，导致前中后三个元素相同，无法判断出最小元素在前面数组还是后面数组中，所以无法缩小查找范围
            if(array[left] == array[right] && array[left] == array[mid]) {
                return getMin(array);
            }
            if(array[left] > array[mid]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return array[mid];
    }

    private int getMin(int[] array) {
        int res = Integer.MAX_VALUE;
        for(int i : array) {
            if(i <= res) res = i;
        }
        return res;
    }
}