package review;

/**
 * 754.到达终点数字
 */
public class Test19 {
    public static void main(String[] args) {
        int target = 2;
        Test19 t19 = new Test19();
        int res = t19.reachNumber(target);
        System.out.println(res);
    }
    public int reachNumber(int target) {
        target = Math.abs(target);
        if(target == 0) {
            return 0;
        }
        int res = 1;
        int step = 2;
        int tmp = 1;
        while(tmp < target || (tmp != target && (tmp - target)%2 != 0)) {
            res++;
            tmp += step;
            step++;
        }
        return res;
     }

}
