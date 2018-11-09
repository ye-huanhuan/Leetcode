package month_10.day11;

public class Test06 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n2.next = n3;
//        n3.next = n4;
        Solution13 s = new Solution13();
        System.out.println(s.middleNode(n1).val);
    }
}

/***
 * 链表的中间节点
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


class Solution13 {
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head != null && head.next == null) {
            return head;
        }
        if(head != null && head.next != null && head.next.next == null){
            return head.next;
        }

        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
