package nowcode;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        int[] test = new int[]{3,6,2,7,1,6,10,8};
        s3.quickSort02(test, 0, test.length-1);
        Arrays.stream(test).forEach(x -> System.out.println(x));
        //数组求和
        int sum = Arrays.stream(test).reduce(0, (x, y) -> x+y);
        System.out.println(sum);
    }
}

/**
 * 快排  nlogn 不稳定
 */
class Solution03 {

    public void quickSort02(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        int base = arr[start];
        while(start < end) {
            while(start < end) {
                if(arr[end] < base) {
                    int tmp = arr[end];
                    arr[end] = base;
                    arr[start] = tmp;
                    break;
                } else {
                   end--;
                }
            }

            while(start < end) {
                if(arr[start] > base) {
                    int tmp = arr[start];
                    arr[start] = base;
                    arr[end] = tmp;
                    break;
                } else {
                    start++;
                }
            }
        }
        if(start > low) {
            quickSort02(arr, low, start-1);
        }
        if(end < high) {
            quickSort02(arr, end+1, high);
        }
    }
    //递归方式
    public void quickSort(int[] numbers,int low,int high) {
        int start = low;
        int end = high;
        int base = numbers[start];
        while(start < end) {
            //先移动右指针
            while(start < end) {
                if(numbers[end] < base) {
                    int tmp = numbers[end];
                    numbers[end] = numbers[start];
                    numbers[start] = tmp;
                    break;
                } else {
                    end--;
                }
            }
            //再移动左指针
            while(start < end) {
                if(numbers[start] > base) {
                    int tmp = numbers[end];
                    numbers[end] = numbers[start];
                    numbers[start] = tmp;
                    break;
                } else {
                    start++;
                }
            }
        }
        //左边还需要快排
        if(start > low) {
            quickSort(numbers, low, start-1);
        }
        //右边还需要快排
        if(end < high) {
            quickSort(numbers, end+1, high);
        }
    }
}
