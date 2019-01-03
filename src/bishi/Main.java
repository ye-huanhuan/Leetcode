package bishi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 使用双指针方式
 */
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        int len = str.length();
        int res = 0;
        //小指针
        int i = 0;
        //大指针
        int j = 0;
        //窗口内的字符
        Set<Character> set = new HashSet<>();
        while (i < len && j < len) {
            // 与窗口内字符不同
            if (!set.contains(str.charAt(j))){
                set.add(str.charAt(j));
                j++;
                res = Math.max(res, j - i);
            }
            else {
                set.remove(str.charAt(i));
                i++;
            }
        }
        System.out.println(res);
    }
}
