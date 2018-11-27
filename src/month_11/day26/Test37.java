package month_11.day26;

import java.util.LinkedList;
import java.util.Queue;

public class Test37 {
}

/**
 * 225. 用队列实现栈
 */
class MyStack {

    private Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int size = queue.size();
        int[] tmp = new int[size];
        int index = 0;
        while(!queue.isEmpty()) {
            tmp[index++] = queue.poll();
        }
        queue.offer(x);
        for(int i : tmp) {
            queue.offer(i);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}