package month_12.day07;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test29 {
    public static void main(String[] args) {
        Solution05 s5 = new Solution05();
        ArrayList<Integer> res = s5.GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8}, 4);
        System.out.println(res);
    }
}

<<<<<<< HEAD
=======
/**
 * 最小的k个数
 */
>>>>>>> f0d62b026fc681ef71e8852d5754e26a406c389e
class Solution05 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input == null || input.length == 0 || input.length < k || k == 0) return res;
        Queue<Integer> queue = new PriorityQueue<>(k, (a,b) -> b-a);
        int i=0;
        for(; i<k; i++) {
            queue.offer(input[i]);
        }
        for(int j=i; j<input.length; j++) {
            if(input[j] <= queue.peek()) {
                queue.poll();
                queue.offer(input[j]);
            }
        }
        while(!queue.isEmpty()) {
            res.add(queue.remove());
        }
        return res;
    }

}