package month_11.day05;

import java.util.LinkedList;
import java.util.Queue;

public class Test02 {
    public static void main(String[] args) {
        RecentCounter r = new RecentCounter();
        System.out.println(r.ping(1));
        System.out.println(r.ping(100));
        System.out.println(r.ping(3001));
        System.out.println(r.ping(3002));
    }
}

/**
 * 933. 最近的请求次数
 */

class RecentCounter {

    private Queue<Integer> queue;


    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while(queue.peek() < t-3000) {
            queue.poll();
        }
        return queue.size();
    }
}
