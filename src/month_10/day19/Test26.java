package month_10.day19;

public class Test26 {
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

/**
 *  删除链表中的节点
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node.next == null) {
            node = null;
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
