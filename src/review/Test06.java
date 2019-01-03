package review;

import java.util.Arrays;

public class Test06 {
    //冒泡排序总共n-1趟，每趟少比一个数   On2   稳定
    public static void main(String[] args) {
        int[] test = new int[]{6,3,8,2,5,7,1,9,10};
        int len = test.length;
        int flag = 0;
        for(int i=0; i<len-1; i++) {
            flag = 0;
            for(int j=1; j<len-1-i; j++) {
                if(test[j] < test[j-1]) {
                    flag++;
                    int tmp = test[j];
                    test[j] = test[j-1];
                    test[j-1] = tmp;
                }
            }
            if(flag == 0){
                break;
            }
        }
        Arrays.stream(test).forEach(x -> System.out.print(x + "  "));
    }
}
