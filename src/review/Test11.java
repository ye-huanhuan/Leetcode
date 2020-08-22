package review;

import java.util.PriorityQueue;

/**
 * 1046. 最后一块石头的重量
 */
public class Test11 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y-x);
        for(int i : stones) {
            pq.add(i);
        }
        while(!pq.isEmpty()) {
            int first = pq.poll();
            if(!pq.isEmpty()) {
                int second = pq.poll();
                if(first != second) {
                    pq.add(first - second);
                }
            } else {
                return first;
            }
        }
        return 0;
    }
}
