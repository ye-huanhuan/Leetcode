package month_12.day10;

public class Test37 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = new int[] {1,2,3,4,6,6,6};
        int res = s.GetNumberOfK02(test, 6);
        System.out.println(res);
    }
}

/**
 * 数字在排序数组中出现的次数
 */
class Solution {

    public int GetNumberOfK02(int [] array , int k) {
        if(array == null || array.length == 0) {
            return 0;
        }
        return search(array, k + 0.5) - search(array, k - 0.5);
    }


    //二分查找
    public int search(int[] arr, double target) {
        if(arr == null || arr.length == 0) return -1;
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low <= high) {
            mid = (high + low)/2;
            if(target == arr[mid]){
                return mid;
            } else if(target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }


    public int GetNumberOfK(int [] array , int k) {
        int index = search(array, k);
        int count = 0;
        if(index != -1) {
            count++;
            int left = index-1;
            int right = index+1;
            while((left >= 0 && array[left] == k)|| (right <= array.length-1 && array[right] == k)) {
                if(left >= 0 && array[left] == k) {
                    count++;
                    left -= 1;
                }
                if(right <= array.length-1 && array[right] == k) {
                    count++;
                    right += 1;
                }
            }
        }
        return count;
    }

    //二分查找
    public int search(int[] arr, int target) {
        if(arr == null || arr.length == 0) return -1;
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while(low <= high) {
            mid = (high + low)/2;
            if(target == arr[mid]){
                return mid;
            } else if(target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}