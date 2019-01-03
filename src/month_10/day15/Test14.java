package month_10.day15;


public class Test14 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n1;

        Solution03 s3 = new Solution03();
        boolean hasCysle = s3.hasCycle(n1);
        System.out.println(hasCysle);

    }
}

//  Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }

/**
 * 判断环形链表
 */
class Solution03 {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
