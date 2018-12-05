package month_12.day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test20 {
}

/**
 * 包含min函数的栈
 */
class Solution02 {

    private List<Integer> data;
    private int min;

    public Solution02() {
        data = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int node) {
        data.add(node);
        if(node <= min) {
            min = node;
        }
    }

    public void pop() {
        int tmp = data.remove(data.size()-1);
        if(tmp == min) {
            min = Integer.MAX_VALUE;
            for(int i : data) {
                if(i <= min) {
                    min = i;
                }
            }
        }
    }

    public int top() {
        return data.get(data.size()-1);
    }

    public int min() {
        return min;
    }
}