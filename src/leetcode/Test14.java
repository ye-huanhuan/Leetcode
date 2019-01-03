package leetcode;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Test14 {

    /**
     * 奇偶链表
     * @param head
     * @return
     */
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode res = head;
        ListNode tmp2 = head.next;
        ListNode tmp1 = tmp2;
        while(head.next != null && tmp2.next != null) {
            head.next = head.next.next;
            tmp2.next = tmp2.next.next;
            head = head.next;
            tmp2 = tmp2.next;
        }
        while(tmp1 != null) {
            head.next = tmp1;
            tmp1 = tmp1.next;
            head = head.next;
        }
        head.next = null;
        return res;
    }
}
