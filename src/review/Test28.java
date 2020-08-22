package review;

/**
 * 1093. 大样本统计
 */
public class Test28 {
    public static void main(String[] args) {
        Test28 t28 = new Test28();
        double[] res = t28.sampleStats(new int[]{0,4,3,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        for(double d : res) {
            System.out.print(d + "  ");
        }
    }
    public double[] sampleStats(int[] count) {
        //最小值、最大值、平均值、中位数、众数
        double[] res = new double[5];
        double min = -1;
        double max = -1;
        double avg = 0;
        double mid = -1;
        double mode = -1;
        double sum = 0;
        int cnt = 0;
        int maxcnt = 0;
        int[] midIndex = {-1,-1};
        int tmpcnt = 0;
        int first = 0;
        int seconde = 0;
        for(int i=0; i<count.length; i++) {
            if(min == -1 && count[i] != 0) {
                min = i;
            }
            if(max == -1 && count[count.length-1-i] != 0) {
                max = count.length-1-i;
            }
            cnt += count[i];
            sum += (count[i] * i);
            if(count[i] > maxcnt) {
                maxcnt = count[i];
                mode = i;
            }
        }
        avg = sum/cnt;
        if(cnt % 2 == 0) {
            midIndex[0] = cnt/2;
            midIndex[1] = cnt/2 + 1;
        } else {
            midIndex[0] = cnt/2 + 1;
        }
        for(int i=0; i<count.length; i++) {
            tmpcnt += count[i];

            if(midIndex[1] != -1 ) {
                if(tmpcnt >= midIndex[1] && first == 0) {
                    mid = i;
                    break;
                }
                if(tmpcnt >= midIndex[1] && first != 0) {
                    mid = (double)(first + i)/2;
                    break;
                }
                if(tmpcnt == midIndex[0]) {
                    first = i;
                }
            }
            if(midIndex[1] == -1 && tmpcnt >= midIndex[0]) {
                mid = i;
                break;
            }
        }
        res[0] = min;
        res[1] = max;
        res[2] = avg;
        res[3] = mid;
        res[4] = mode;
        return res;
    }
}
