package nowcode;

import java.util.Arrays;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        int res = getLuckyPrice(1070, Arrays.asList(1,2,4,7,8));
        System.out.println(res);
    }
    /**
     * 小明认为某些数字不吉利，付账时会尽可能少的多付一些钱，使得价格中不包含这些不吉利数字，并且不出现0.
     * 例如，不吉利数字为1，4，7，8，商品价格为1000，小明实际支付2222.实现程序
     * @param price
     * @param unlucky_numbers
     * @return
     */
    static int getLuckyPrice(int price,List<Integer> unlucky_numbers){

        int res = 0;
        int[] tmp = new int[1024];
        int index = 0;
        while(price > 0) {
            tmp[index++] = price%10;
            price /= 10;
        }
        for(int i=index-1; i>=0; i--) {

            while(unlucky_numbers.contains(tmp[i]) || tmp[i] == 0) {
                tmp[i] += 1;
            }
            res = res*10 + tmp[i];
        }
        return res;
    }
}
