package month_11.day05;

public class Test04 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l5.next = l6;
        l6.next = l7;
        Solution02 s2 = new Solution02();
        s2.mergeTwoLists(l1, l5);

    }
}

/**
 * Definition for singly-linked list.
 **/
 class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

/**
 * 21. 合并两个有序链表
 */
class Solution02 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode newNode = new ListNode(0);
        head = newNode;
        while(l1 !=null && l2 != null) {
            ListNode curNode = new ListNode(0);
            newNode.next = curNode;
            newNode = newNode.next;
            if(l1.val < l2.val) {
                newNode.val = l1.val;
                l1 = l1.next;
            } else {
                newNode.val = l2.val;
                l2 = l2.next;
            }

        }
        if(l1 != null) {
            newNode.next = l1;
        }
        if(l2 != null) {
            newNode.next = l2;
        }
        return head.next;
    }
}
