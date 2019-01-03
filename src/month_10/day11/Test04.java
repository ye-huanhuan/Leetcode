package month_10.day11;

public class Test04 {
    public static void main(String[] args) {
        int[] temper = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] r = new Solution10().dailyTemperatures(temper);
        for(int i : r) {
            System.out.print(i + "  ");
        }
    }
}

/**
 * 查找最近升温日期的距离
 * 算法：分为两类，一类是相邻两个是升温（不用处理，直接为1），二类相邻两个是降温（一直查找低温的升温距离日期，直到温度高于当前温度）
 */

class Solution10 {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];

        result[len - 1] = 0;

        for(int i=len-2; i>=0; i--) {
            int j = i + 1;
            if(temperatures[i] < temperatures[j]) {
                result[i] = 1;
            } else {
                while(temperatures[i] >= temperatures[j] && result[j] != 0) {
                    j += result[j];
                }
                if(temperatures[i] < temperatures[j]) {
                    result[i] = j - i;
                }else {
                    result[i] = 0;
                }
            }
        }
        return result;
    }
}

class Solution09 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int i=0; i<temperatures.length; i++) {
            if(i == temperatures.length-1) {
                result[i] = 0;
                break;
            }
            for(int j=i+1; j<temperatures.length; j++) {
                if(temperatures[j] > temperatures[i]) {
                   result[i] = j-i;
                   break;
                }
            }
        }
        return result;
    }
}



