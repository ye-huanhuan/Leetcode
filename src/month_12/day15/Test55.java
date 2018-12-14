package month_12.day15;

public class Test55 {
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 链表中环的入口节点
 * head节点到环的入口节点距离和相遇点到环的入口节点距离相等
 */
class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead == null) return null;
        ListNode slow = pHead;
        ListNode fast = pHead;
        while(slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }
        if(slow == null || fast == null || fast.next == null) return null;
        ListNode res = pHead;
        while(res != slow) {
            res = res.next;
            slow = slow.next;

        }
        return res;
    }
}