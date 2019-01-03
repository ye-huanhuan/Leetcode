package month_10.day22;

import java.util.Scanner;

/**
 * 牛客网-字节跳动 坐标右上方
 */
public class Test30 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = Integer.parseInt(read.nextLine());
        int[][] point = new int[num][2];
        for(int i=0; i<num; i++) {
            String str = read.nextLine();
            point[i][0] = Integer.parseInt(str.split(" ")[0]);
            point[i][1] = Integer.parseInt(str.split(" ")[1]);
        }

        for(int i=0; i<num; i++) {
            boolean flag = true;
            for(int j=0; j<num; j++) {
                if(point[i][0] < point[j][0] && point[i][1] < point[j][1]) flag = false;
            }
            if(flag) System.out.println(point[i][0] + " " + point[i][1]);
        }
    }
}
