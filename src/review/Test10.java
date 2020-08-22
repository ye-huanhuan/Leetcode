package review;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * 19.删除链表的倒数第N个节点
 */
public class Test10 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0; i<n; i++) {
            fast = fast.next;
        }
        if(fast == null) {
            return head.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
