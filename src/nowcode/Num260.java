package nowcode;

public class Num260 {

    public static void main(String[] args) {
        int[] test = {1,2,1,3,2,5};
        Num260 num260 = new Num260();
        int[] res = num260.singleNumber(test);
        System.out.println(res[0] + " " + res[1]);
    }

    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0) {
            return res;
        }
        int tmp = 0;
        for (int num : nums) {
            tmp ^= num;
        }

        int x = 1;
        while((tmp & x) != x) {
            x <<= 1;
        }

        int res1 = 0;
        int res2 = 0;
        for (int num : nums) {
            if((num & x) == x) {
                res1 ^= num;
            } else {
                res2 ^= num;
            }
        }
        res[0] = res1;
        res[1] = res2;
        return res;
    }
}
