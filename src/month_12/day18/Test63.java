package month_12.day18;

import java.util.PriorityQueue;

public class Test63 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        s3.Insert(4);
        System.out.println(s3.GetMedian());
        s3.Insert(2);
        s3.Insert(3);
        System.out.println(s3.GetMedian());
        s3.Insert(5);
        s3.Insert(6);
        s3.Insert(1);
        System.out.println(s3.GetMedian());
    }
}

/**
 * 数据流中的中位数
 */
class Solution03 {

    private PriorityQueue<Integer> lessQueue = new PriorityQueue<>((x, y) -> y-x);
    private PriorityQueue<Integer> greaterQueue = new PriorityQueue<>((x, y) -> x-y);
    public void Insert(Integer num) {
        if(lessQueue.isEmpty() || num <= lessQueue.peek()) {
            lessQueue.add(num);
        } else {
            greaterQueue.add(num);
        }
        if(lessQueue.size() - greaterQueue.size() > 1) {
            greaterQueue.add(lessQueue.poll());
        }
        if(greaterQueue.size() - lessQueue.size() > 1) {
            lessQueue.add(greaterQueue.poll());
        }
    }

    public Double GetMedian() {
        double res = 0.0;
        if(lessQueue.size() == greaterQueue.size()) {
            res = (lessQueue.peek() + greaterQueue.peek())/2.0;
        } else if(lessQueue.size() > greaterQueue.size()) {
            res = lessQueue.peek()/1.0;
        } else {
            res = greaterQueue.peek()/1.0;
        }
        return res;
    }
}