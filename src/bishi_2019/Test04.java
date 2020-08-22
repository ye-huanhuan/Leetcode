package bishi_2019;

import java.util.HashMap;
import java.util.Map;

/**
 * 汉字转数字
 */
public class Test04 {

    private static Map<Character, Integer>  ch2Di = new HashMap<>();
    private static Map<Character, Integer>  unit2Di = new HashMap<>();
    public static void init() {
//        unit2Di.put('亿', 100000000);
        unit2Di.put('万', 10000);
        unit2Di.put('千', 1000);
        unit2Di.put('百', 100);
        unit2Di.put('十', 10);
        ch2Di.put('一', 1);
        ch2Di.put('二', 2);
        ch2Di.put('三', 3);
        ch2Di.put('四', 4);
        ch2Di.put('五', 5);
        ch2Di.put('六', 6);
        ch2Di.put('七', 7);
        ch2Di.put('八', 8);
        ch2Di.put('九', 9);
    }

    public long parce(String str) {
        Test04.init();
        long res = 0;
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length; i++) {
            if(ch2Di.containsKey(chars[i]) && i+1 < chars.length && unit2Di.containsKey(chars[i+1])) {
                res += (ch2Di.get(chars[i])*unit2Di.get(chars[i+1]));
                i++;
            } else if(unit2Di.containsKey(chars[i])) {
                res *= unit2Di.get(chars[i]);
            } else if(ch2Di.containsKey(chars[i])){
                res += ch2Di.get(chars[i]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Test04 t4 = new Test04();
        long res = t4.parce("九千三百万五千三百八十五");
        System.out.println(res);
    }
}
