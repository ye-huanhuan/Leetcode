package month_12.day17;

public class Test56 {
    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = null;
        ListNode res = s2.deleteDuplication(l1);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}

/**
 * 删除链表中重复的结点
 */
class Solution02 {
    //重复节点保留一个
    public ListNode deleteDuplication02(ListNode pHead) {
        if(pHead == null) return pHead;
        ListNode res = pHead;
        while(pHead.next != null) {
            if(pHead.val == pHead.next.val) {
                pHead.val = pHead.next.val;
                pHead.next = pHead.next.next;
            } else {
                pHead = pHead.next;
            }
        }
        return res;
    }

    //不保留重复节点
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null || pHead.next == null) {
            return pHead;
        }
        //该节点是重复节点
        if(pHead.val == pHead.next.val) {
            ListNode pNode = pHead;
            while(pNode != null && pNode.val == pHead.val) {
                pNode = pNode.next;
            }
            return deleteDuplication(pNode);
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}