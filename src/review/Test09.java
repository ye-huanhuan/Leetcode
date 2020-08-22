package review;

import java.util.*;

/**
 * 347.前k个高频元素
 */
public class Test09 {
    public static void main(String[] args) {
        int[] test = {1,1,1,2,2,3};
        int k = 2;
        Test09 t9 = new Test09();
        t9.topKFrequent(test, k);
    }
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> numToCnt = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(!numToCnt.containsKey(nums[i])) {
                numToCnt.put(nums[i], 1);
            } else {
                numToCnt.put(nums[i], numToCnt.get(nums[i]) + 1);
            }
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, (o1, o2) -> numToCnt.get(o2) - numToCnt.get(o1));

        for(int i : numToCnt.keySet()) {
            priorityQueue.add(i);
        }
        for(int i=0; i<k; i++) {
            res.add(priorityQueue.poll());
        }
        return res;
    }
}
