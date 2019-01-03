package month_10.day11;

import java.util.Stack;

public class Test08 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        ListNode n5 = new ListNode(5);
        ListNode n7 = new ListNode(7);
        ListNode n9 = new ListNode(9);
        ListNode n11 = new ListNode(11);
        ListNode n13 = new ListNode(13);
        n1.next = n3;
        n3.next = n5;
        n5.next = n7;
        n7.next = n9;
        n9.next = n11;
        n11.next = n13;
        Solution16 s = new Solution16();
        ListNode revhead = s.reverseList(n1);
        while(revhead != null) {
            System.out.println(revhead.val);
            revhead = revhead.next;
        }

    }
}
/**
 * 反转链表
 */
class Solution15 {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        Stack<ListNode> stack = new Stack<>();
        while(head.next != null) {
           stack.push(head);
           head = head.next;
        }
        ListNode revList = head;
        while(!stack.empty()){
            head.next = stack.peek();
            stack.pop();
            head = head.next;
        }
        head.next = null;
        return revList;
    }
}


class Solution16 {
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode curnode = head;
        ListNode prenode = null;
        while(head != null) {
            head = head.next;
            curnode.next = prenode;
            prenode = curnode;
            curnode = head;
        }
        return prenode;
    }
}
