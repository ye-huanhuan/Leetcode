package month_10.day22;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test34 {
}

/**
 * 20.有效的括号
 */
class Solution06 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> maps = new HashMap<>();
        maps.put('{', '}');
        maps.put('(', ')');
        maps.put('[', ']');
        for(char c : chars) {
            if(maps.containsKey(c)) {
                stack.push(maps.get(c));
            } else {
                if(stack.isEmpty()) return false;
                if(c == stack.peek()) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}