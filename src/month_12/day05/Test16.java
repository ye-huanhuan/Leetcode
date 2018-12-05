package month_12.day05;

public class Test16 {
}

/**
 * 合并两个排序的链表
 */
class Solution04 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode curNode = new ListNode(0);
        ListNode head = curNode;
        while(list1 != null && list2 != null) {
            ListNode newNode = new ListNode(0);
            curNode.next = newNode;
            curNode = curNode.next;
            if(list1.val <= list2.val) {
                newNode.val = list1.val;
                list1 = list1.next;
            } else {
                newNode.val = list2.val;
                list2 = list2.next;
            }
        }
        if(list1 != null) {
            curNode.next = list1;
        }
        if(list2 != null) {
            curNode.next = list2;
        }
        return head.next;

    }
}