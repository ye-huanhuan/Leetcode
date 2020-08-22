package bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        String res = fractionToDecimal(a,b);
        System.out.println(res);
    }
    public static String fractionToDecimal(int p, int q) {
        StringBuilder sb = new StringBuilder();
        if (p > 0 && q < 0 || p < 0 && q > 0) sb.append('-');
        long i = (long)Math.abs(p), j = (long)Math.abs(q);
        sb.append(Math.abs(i/j));
        i = i % j;
        if (i != 0) sb.append('.');
        int idx = sb.length();
        List<Long> list = new ArrayList();
        list.add(i);
        while(i != 0){
            i *= 10;
            if (list.contains(i%j)) {
                sb.insert(idx+list.indexOf(i%j), '(').append(Math.abs(i/j)).append(')');
                break;
            }else{
                sb.append(Math.abs(i/j));
                i = i%j;
                list.add(i);
            }
        }
        return sb.toString();
    }
}
