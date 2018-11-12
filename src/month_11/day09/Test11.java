package month_11.day09;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 贝壳2018数据挖掘工程师在线笔试题目（内推）
 众所周知，新款笔记本电脑都拥有自己的省电方案，现有某品牌笔记本电脑，正常工作状态下耗电量为P1/min，当机主离开电脑
 T1min时，电脑进入屏幕保护状态，耗电量为P2/min，当电脑进入屏保状态T2min后，电脑进入睡眠状态，耗电量为P3/min。
 已知电脑主人的一天有n段时间在使用电脑工作,即[l1, r1], [l2, r2],…, [ln, rn],在[rn-1, ln]期间是没有操作电脑的，问
 在[l1, rn]时间内，电脑共耗电多少瓦。
 例：输入
 n,p1,p2,p3,T1,T2，其中，n表示使用电脑的时间段。
 2 8 4 2 5 10
 20 30
 50 100
 输出：
 570
 解释：
 总耗电量 = 80 + 40 + 40 + 10 + 400 = 570W
 20-30min: 80W = 10min * 8W/min
 30-35min：40W = 5min * 8W/min
 35-45min: 40W = 10min * 4W/min
 45-50min: 10W = 5min * 2W/min
 50-100min: 400W = 50 * 8W/min

 */
public class Test11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int res = 0;
        String s = read.nextLine();
        String[] arr = s.split(" ");
        int n = Integer.parseInt(arr[0]);
        int p1 = Integer.parseInt(arr[1]);
        int p2 = Integer.parseInt(arr[2]);
        int p3 = Integer.parseInt(arr[3]);
        int t1 = Integer.parseInt(arr[4]);
        int t2 = Integer.parseInt(arr[5]);
        List<int[]> working = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String str = read.nextLine();
            String[] strs = str.split(" ");
            working.add(new int[]{Integer.parseInt(strs[0]), Integer.parseInt(strs[1])});
        }
        for(int j=0; j<working.size(); j++) {
            res += p1*(working.get(j)[1] - working.get(j)[0]);
            if(j < working.size()-1) {
                res += spacePower(working.get(j)[1], working.get(j+1)[0], t1, t2, p1, p2, p3);
            }
        }
        System.out.println(res);

    }

    public static int spacePower(int a, int b, int t1, int t2, int p1, int p2, int p3){
        if(a==b) return 0;
        int sum = 0;
        int sub = b - a;
        if(sub <= t1) {
            sum += sub*p1;
        } else if(sub >t1 && sub <= t1+t2) {
            sum = sum + t1*p1 + (sub-t1)*p2;
        } else {
            sum = sum + t1*p1 + t2*p2 + p3*(sub-(t1+t2));
        }
        return sum;
    }
}

