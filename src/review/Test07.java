package review;

import java.util.Arrays;

public class Test07 {
    /**
     * 堆排序 nlogn 不稳定
     1、初始化大顶堆（从最后一个非叶子节点开始，进行对比调整成大顶堆）
     2、每次根节点和最后一个节点进行交换，然后重新调整大顶堆
     */
    public static void main(String[] args) {
        int[] test = new int[]{6,3,8,2,5,7,1,10,9};
        HeapSort(test);
        Arrays.stream(test).forEach(x -> System.out.print(x + "  "));
    }
    static int len;
    public static int[] HeapSort(int[] array) {
        len = array.length;
        if (len < 1) return array;
        //1.构建一个最大堆
        buildMaxHeap(array);
        //2.循环将堆首位（最大值）与末位交换，然后在重新调整最大堆
        while (len > 0) {
            swap(array, 0, len - 1);
            len--;
            adjustHeap(array, 0);
        }
        return array;
    }
    /**
     * 建立最大堆
     */
    public static void buildMaxHeap(int[] array) {
        //从最后一个非叶子节点开始向上构造最大堆
        for (int i = (len/2 - 1); i >= 0; i--) {
            adjustHeap(array, i);
        }
    }
    /**
     * 调整使之成为最大堆
     */
    public static void adjustHeap(int[] array, int i) {
        int maxIndex = i;
        //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex])
            maxIndex = i * 2 + 1;
        //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (i * 2 + 2 < len && array[i * 2 + 2] > array[maxIndex])
            maxIndex = i * 2 + 2;
        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            swap(array, maxIndex, i);
            adjustHeap(array, maxIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
