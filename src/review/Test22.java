package review;

import java.util.PriorityQueue;

/**
 * 414. 第三大的数
 */
public class Test22 {
    public static void main(String[] args) {
        int[] test = {-2147483648,1,1};
//        int[] test = {2,2,3,1};

        Test22 t22 = new Test22();
        int res = t22.thirdMax(test);
        System.out.println(res);
    }
    public int thirdMax(int[] nums) {
        PriorityQueue<Long> pq = new PriorityQueue<Long>((o1, o2)-> {
            if(o2.longValue() - o1.longValue() >= 0) {
                return 1;
            } else {
                return -1;
            }
        });
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            if(!pq.contains(new Long(nums[i]))) {
                pq.add(new Long(nums[i]));
            }
        }
        if(pq.size() < 3) {
            return pq.poll().intValue();
        }
        pq.poll();
        pq.poll();
        res = pq.poll().intValue();
        return res;
    }
}
