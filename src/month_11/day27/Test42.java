package month_11.day27;

public class Test42 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l6 = new ListNode(6);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l7 = new ListNode(6);
        l1.next = l2;
        l2.next = l6;
        l6.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l7;
        l7.next = null;
        Solution s = new Solution();
        ListNode res = s.removeElements(l1, 6);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }


}

/**
 * 203. 移除链表元素
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode cur = new ListNode(-1);
        ListNode res = cur;
        while(head != null) {
            if(head.val != val) {
                cur.next = head;
                cur = cur.next;
            } else {    //先暂定为head的后一个节点，因为cur节点没有改变只是改变cur的next节点所以不影响后续cur改变next
                cur.next = head.next;
            }
            head = head.next;
        }
        return res.next;
    }
    public ListNode removeElements02(ListNode head, int val) {
        if(head == null) {
            return head;
        }
        while(head.val == val) {
            head = head.next;
        }
        ListNode first = head;
        ListNode seconde = head.next;

        while(seconde != null) {
            if(seconde.val == val) {
                first.next = seconde.next;
            } else {
                first = first.next;
            }
            seconde = seconde.next;

        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
