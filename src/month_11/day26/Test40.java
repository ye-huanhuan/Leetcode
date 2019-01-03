package month_11.day26;

import java.util.Stack;

public class Test40 {
}

/**
 * 557. 反转字符串中的单词 III
 */
class Solution03 {
    public String reverseWords(String s) {
        StringBuilder res  = new StringBuilder();
        String[] strs = s.split(" ");
        Stack<Character> stack = new Stack<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            for(char c : chars) {
                stack.push(c);
            }
            while(!stack.isEmpty()) {
                res.append(stack.pop());
            }
            res.append(" ");
        }
        String str = res.toString();
        return str.substring(0, str.length()-1);
    }
}