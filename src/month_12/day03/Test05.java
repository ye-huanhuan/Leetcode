package month_12.day03;

import java.util.Stack;

public class Test05 {
    public static void main(String[] args) {
        Solution05 s5 = new Solution05();
        s5.push(1);
        s5.push(4);
        s5.push(2);
        System.out.println(s5.pop());
        System.out.println(s5.pop());
        s5.push(10);
        System.out.println(s5.pop());
        System.out.println(s5.pop());
    }
}

/**
 * 用两个栈实现队列
 */
class Solution05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
       stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
