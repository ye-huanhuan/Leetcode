package month_12.day06;

import java.util.Stack;

public class Test21 {
}

/**
 * 栈的压入、弹出序列
 */
class Solution03 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length != popA.length) return false;
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;
        int popIndex = 0;
        while(true) {
            if(stack.isEmpty() && pushIndex == pushA.length) return true;
            if(!stack.isEmpty() && popA[popIndex] != stack.peek() && pushIndex >= pushA.length) return false;
            if(stack.isEmpty() || (!stack.isEmpty() && popA[popIndex] != stack.peek())) {
                stack.push(pushA[pushIndex++]);
            } else {
                stack.pop();
                popIndex++;
            }
        }
    }
}