package month_12.day05;

import java.util.Stack;

public class Test14 {
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 链表中倒数第k个结点
 */
class Solution02 {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode res = null;
        while(head != null) {
            stack.push(head);
            head = head.next;
        }
        while(!stack.isEmpty()){
            res = stack.pop();
            if(--k == 0) {
                break;
            }
        }
        return k != 0 ? null : res;
    }
}