package bishi_2019;

public class Test01 {
    public static void main(String[] args) {
        int[] test1 = {1, 0, 1, 0, 0, 1};
        int[] test2 = {0, 0, 0, 0, 0, 0};
        int[] test3 = {1, 1, 1, 1, 1, 1};
        int[] test4 = {1};
        Test01 t01 = new Test01();
        t01.test02(test1);
        for(int i : test1) {
            System.out.print(i + "  ");
        }
    }

    public void test(int[] arr) {
        if(arr.length < 2) return;
        int slow = 0;
        int fast = 1;
        while(slow < arr.length && fast < arr.length) {
            if(arr[slow] == 0 && arr[fast] == 1) {
                slow++;
                fast++;
            } else if(arr[slow] == 0 && arr[fast] == 0) {
                slow++;
            } else if(arr[slow] == 1 && arr[fast] == 0) {
                int tmp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = tmp;
            } else if(arr[slow] == 1 && arr[fast] == 1) {
                fast++;
            }
        }
    }

    public void test02(int[] arr) {
        if(arr.length < 2) return;
        int slow = 0;
        int fast = arr.length - 1;
        while(slow < fast) {
            if(arr[slow] == 0 && arr[fast] == 0) {
                slow++;
            } else if(arr[slow] == 0 && arr[fast] == 1) {
                slow++;
                fast--;
            } else if(arr[slow] == 1 && arr[fast] == 0) {
                int tmp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = tmp;
            } else if(arr[slow] == 1 && arr[fast] == 1) {
                fast--;
            }
        }
    }
}
