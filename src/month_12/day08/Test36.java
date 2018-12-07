package month_12.day08;

public class Test36 {
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

/**
 * 两个链表的第一个公共结点
 */
class Solution06 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) {
            return null;
        }
        //注意需要先将头结点保存下来
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while(pHead1 != pHead2) {
            pHead1 = pHead1 != null ? pHead1.next : p2;
            pHead2 = pHead2 != null ? pHead2.next : p1;
        }
        return pHead1;
    }
}