package leetcode;

import java.util.Arrays;

public class Test11 {
    public static void main(String[] args) {
        int k = 4;
        int[] test = new int[]{3,5,2,7};
        KthLargest kl = new KthLargest(k, test);
        Arrays.stream(kl.arr).forEach(x -> System.out.print(x + "  "));
        System.out.println();
        System.out.println(kl.add(-3));
        Arrays.stream(kl.arr).forEach(x -> System.out.print(x + "  "));
        System.out.println(kl.add(-2));
        Arrays.stream(kl.arr).forEach(x -> System.out.print(x + "  "));
        System.out.println(kl.add(-4));
        Arrays.stream(kl.arr).forEach(x -> System.out.print(x + "  "));
        System.out.println(kl.add(0));
        Arrays.stream(kl.arr).forEach(x -> System.out.print(x + "  "));
        System.out.println(kl.add(4));
        Arrays.stream(kl.arr).forEach(x -> System.out.print(x + "  "));
    }
}

/**
 * 数据流中的第k大元素
 */
class KthLargest {
    public int[] arr;
    public int len;
    public KthLargest(int k, int[] nums) {
        len = k;
        arr = new int[k];
        int sub = nums.length - k;
        int index = 0;
        int i=0;
        for(; i>sub; i--) {
            arr[Math.abs(i)] = Integer.MIN_VALUE;
        }
        for(int j=Math.abs(i); j<k; j++) {
            arr[j] = nums[index++];
        }
        buildMinHeap(arr);
        for(int x=index; x<nums.length; x++) {
            if(nums[x] < arr[0]) {
                continue;
            } else {
                arr[0] = nums[x];
                adjustHeap(arr, 0);
            }
        }

    }

    public int add(int val) {
        if(val < arr[0]) {
            return arr[0];
        } else {
            arr[0] = val;
            adjustHeap(arr, 0);
            return arr[0];
        }
    }

    public void buildMinHeap(int[] arr) {
        for(int i=len/2-1; i>=0; i--) {
            adjustHeap(arr, i);
        }
    }

    public void adjustHeap(int[] arr, int i) {
        int minIndex = i;

        if(2*i+1 < len && arr[2*i+1] < arr[minIndex]) {
            minIndex = 2*i + 1;
        }

        if(2*i+2 < len && arr[2*i+2] < arr[minIndex]) {
            minIndex = 2*i + 2;
        }

        if(minIndex != i) {
            swap(arr, minIndex, i);
            adjustHeap(arr, minIndex);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}