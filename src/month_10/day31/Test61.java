package month_10.day31;

import java.util.Scanner;

public class Test61 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int count = Integer.parseInt(read.nextLine());
        String turnStr = read.nextLine();
        char[] chars = turnStr.toCharArray();
        int sum = 0;
        for(char c : chars) {
            if(c == 'L') sum--;
            else if(c == 'R') sum++;
        }
        int tmp = sum%4;
        char res = 'N';
        switch (tmp) {
            case 0 : res = 'N'; break;
            case 1 : res = 'E'; break;
            case 2 : res = 'S'; break;
            case 3 : res = 'W'; break;
            case -1 : res = 'W'; break;
            case -2 : res = 'S'; break;
            case -3 : res = 'E'; break;
        }
        System.out.println(res);
    }
}
