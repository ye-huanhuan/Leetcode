package month_11.day09;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述：
 现有n个物品，每个物品有三个参数 ai , bi , ci ，定义i物品不合格品的依据是 : 若存在物品 j , 且aj>ai , bj>bi , cj>ci，则称i物品为不合格品。

 现给出n个物品的a,b,c参数，请你求出不合格品的数量。

 输入
 第一行包含一个整数n(1<=n<=500000),表示物品的数量。接下来有n行，每行有三个整数，ai,bi,ci表示第i个物品的三个参数，1≤ai,bi,ci≤109。

 输出
 输出包含一个整数，表示不合格品的数量。

 样例输入
 3
 1 4 2
 4 3 2
 2 5 3
 样例输出
 1

 Hint
 样例解释
 物品1的a,b,c均小于物品3的a,b,c,因此1为不合格品。
 */
public class Test12 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int res = 0;
        int n = Integer.parseInt(read.nextLine());
        List<Product> products = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String str = read.nextLine();
            String[] attributes = str.split(" ");
            Product pro = new Product(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[1]), Integer.parseInt(attributes[2]));
            products.add(pro);
        }

        for(Product p1 : products) {
            for(Product p2 : products) {
                if(p1.a < p2.a && p1.b < p2.b && p1.c < p2.c) {
                    res ++;
                }
            }
        }
        System.out.println(res);
    }

}

class Product {
    int a;
    int b;
    int c;

    Product(){

    }

    Product(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
