package month_12.day05;

public class Test15 {
}

/**
 * 反转链表
 */
class Solution03 {
    public ListNode ReverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode curNode = head;
        ListNode preNode = null;
        while(head != null) {
            head = head.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = head;
        }
        return preNode;
    }
}