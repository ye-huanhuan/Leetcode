package month_11.day26;

import java.util.Stack;

public class Test39 {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        Solution02 s2  = new Solution02();
        boolean res = s2.validateStackSequences(pushed, popped);
        System.out.println(res);
    }
}

/**
 * 946. 验证栈序列
 */
class Solution02 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        int pushIndex = 0;
        while(true) {
            if(pushIndex >= pushed.length && stack.isEmpty()) return true;
            if(stack.isEmpty()) {
                if(pushIndex >= pushed.length) return false;
                stack.push(pushed[pushIndex++]);
            } else if(!stack.isEmpty() && popped[popIndex] != stack.peek()) {
                if(pushIndex >= pushed.length) return false;
                stack.push(pushed[pushIndex++]);
            } else {
                popIndex++;
                stack.pop();
            }
        }
    }
}