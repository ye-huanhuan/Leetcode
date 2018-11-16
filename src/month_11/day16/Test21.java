package month_11.day16;

import java.util.Stack;

public class Test21 {

    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        int res = s2.calPoints(new String[]{"5","2","C","D","+"});
        System.out.println(res);
    }
}

/**
 * 682. 棒球比赛
 */
class Solution02 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String str : ops) {
            if("C".equals(str)) {
                stack.pop();
            } else if("+".equals(str)) {
                int first = stack.pop();
                int second = stack.pop();
                int cur = first + second;
                stack.push(second);
                stack.push(first);
                stack.push(cur);
            } else if("D".equals(str)) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(new Integer(str));
            }
        }

        while(!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}