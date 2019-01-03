package month_11.day26;

import java.util.Stack;

public class Test38 {
}

/**
 * 232. 用栈实现队列
 */
class MyQueue {

    private Stack<Integer> stack;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        int size = stack.size();
        int[] tmp = new int[size];
        int index = 0;
        while(!stack.isEmpty()) {
            tmp[index++] = stack.pop();
        }
        stack.push(x);
        for(int i=tmp.length-1; i>=0; i--) {
            stack.push(tmp[i]);
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
