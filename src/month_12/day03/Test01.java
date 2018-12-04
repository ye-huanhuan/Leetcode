package month_12.day03;

public class Test01 {
}


/**
 二维数组中的查找
 **/
class Solution {
    /**
     * 利用二维数组由上到下，由左到右递增的规律，
     * 那么选取左下角或者右上角的元素a[i][j]与target进行比较，
     * 当target大于元素a[i][j]时，那么target必定在元素a所在行的右边,
     * 即j++；
     * 当target小于元素a[i][j]时，那么target必定在元素a所在列的上边,
     * 即i--；
     * 时间复杂度m+n
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || (array.length == 1 && array[0].length == 0)) return false;
        int i = array.length-1;
        int j = 0;
        while(i >= 0 && j <= array[0].length - 1) {
            if(target > array[i][j]) {
                j++;
            } else if(target < array[i][j]) {
                i--;
            } else {
                return true;
            }
        }
        return false;
    }
}