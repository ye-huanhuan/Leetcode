package month_11.day20;

import java.util.Stack;

public class Test29 {
}


// Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

/**
 * 445. 两数相加 II
 */
class Solution02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();

        while(l1 != null) {
            stack1.push(l1);
            l1 = l1.next;
        }

        while(l2 != null) {
            stack2.push(l2);
            l2 = l2.next;
        }

        int flag = 0;
        int isDeleted = 0;
        ListNode cur = new ListNode(0);
        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            int num1 = stack1.pop().val;
            int num2 = stack2.pop().val;
            int tmp = num1 + num2 + flag;
            ListNode head = null;
            if(tmp >= 10) {
                head = new ListNode((tmp%10));
                flag = 1;
            } else {
                head = new ListNode((tmp));
                flag = 0;
            }
            head.next = cur;
            cur = head;
            if(isDeleted == 0) {
                isDeleted++;
                cur.next = null;
            }
        }


        while(!stack1.isEmpty()) {
            int num1 = stack1.pop().val;
            int tmp = num1 + flag;
            ListNode head = null;
            if(tmp >= 10) {
                head = new ListNode((tmp%10));
                flag = 1;
            } else {
                head = new ListNode((tmp));
                flag = 0;
            }
            head.next = cur;
            cur = head;
            if(isDeleted == 0) {
                isDeleted++;
                cur.next = null;
            }
        }

        while(!stack2.isEmpty()) {
            int num2 = stack2.pop().val;
            int tmp = num2 + flag;
            ListNode head = null;
            if(tmp >= 10) {
                head = new ListNode((tmp%10));
                flag = 1;
            } else {
                head = new ListNode((tmp));
                flag = 0;
            }
            head.next = cur;
            cur = head;
            if(isDeleted == 0) {
                isDeleted++;
                cur.next = null;
            }
        }

        if(stack1.isEmpty() && stack2.isEmpty() && flag != 0) {
            ListNode head = new ListNode(flag);
            head.next = cur;
            cur = head;
        }
        return cur;
    }
}
