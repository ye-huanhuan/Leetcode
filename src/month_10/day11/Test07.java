package month_10.day11;

public class Test07 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
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

        Solution14 s = new Solution14();
        System.out.println(s.getIntersectionNode(n1,n2));
    }

}

/**
 * 相交链表
 */
class Solution14 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }

        ListNode tmpA = headA;
        ListNode tmpB = headB;
        ListNode currentNode = null;
        while(headA != currentNode) {
            currentNode = tmpA;
            if(tmpA.next == null) {
                tmpA.next = headB;
            } else {
                tmpA = tmpA.next;
            }
            if(tmpB.next == null) {
                tmpB.next = headA;
            } else {
                tmpB = tmpB.next;
            }
            if(tmpA == tmpB){
                return tmpA;
            }
        }
        return null;
    }
}
