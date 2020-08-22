package interview;

import java.util.Arrays;
import java.util.Comparator;

public class MiTuo {

    public static void main(String[] args) {
        MiTuo mt = new MiTuo();
        int[] test = {-1, 0, 5, 0};
//        int[] test = {0,0,0,0};
//        int[] test = {-1, 2, 9, -5};
        mt.moveZeroToTail(test);
        for(int i : test) {
            System.out.print(i + "  ");
        }

        System.out.println();
        System.out.println(mt.nextBigInt(1233));
        System.out.println(mt.nextBigInt(1323));
        System.out.println(mt.nextBigInt(1211));
        System.out.println(mt.nextBigInt(9876));
        System.out.println(mt.nextBigInt(12453));
        System.out.println(mt.nextBigInt(124532));
    }

    public void moveZeroToTail(int[] arr) {
        int slow = arr.length - 1;
        int fast = arr.length - 2;
        while(fast >= 0 && slow >= 0) {
            if(arr[fast] == 0) {
                int tmp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = tmp;
            }
            if(arr[fast] != 0) {
                fast--;
            }
            slow--;
        }
    }

    public int nextBigInt(int test) {
        int flag = test;
        Integer[] testArr = new Integer[32];
        int i = 0;
        while(test != 0) {
            testArr[i] = test % 10;
            i++;
            test /= 10;
        }
        for(int j=0; j<i-1; j++) {
            if(testArr[j] > testArr[j+1]) {
                int tmp = testArr[j];
                testArr[j] = testArr[j+1];
                testArr[j+1] = tmp;
                Arrays.sort(testArr, 0, j + 1, (Integer o1, Integer o2) -> o2-o1);
                break;
            }
        }

        int res = 0;
        for(int j=i-1; j>=0; j--) {
            res = res*10 + testArr[j];
        }
        return res == flag ? -1 : res;
    }


}

class MyComparator implements Comparator<Integer>{
     @Override
     public int compare(Integer o1, Integer o2) {

                 if(o1 < o2) {
                         return 1;
                    }else if(o1 > o2) {
                         return -1;
                     }else {
                         return 0;
                     }
             }

         }
