package month_12.day03;

import java.util.ArrayList;
import java.util.Stack;

public class Test03 {
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
/**
 * 从尾到头打印链表
 */
class Solution03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if(listNode == null) return res;
        Stack<Integer> stack = new Stack<>();
        while(listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

    //单纯打印可以使用递归
    public void printListFromTailToHead02(ListNode listNode) {

        if(listNode.next != null) {
            printListFromTailToHead(listNode.next);
        }
        System.out.println(listNode.val);

    }
}