package month_11.day01;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
}

/**
 * 155. 最小栈
 */
class MinStack {

    private List<Integer> data;
    private int min;
    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if(x <= min){
            min = x;
        }
        data.add(x);
    }

    public void pop() {
        int removed = data.remove(data.size()-1);

        if(removed <= min) {
            if(data.size() == 0) {
                min = Integer.MAX_VALUE;
                return;
            }
            min = data.get(0);
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

    public int getMin() {
        return min;
    }


}