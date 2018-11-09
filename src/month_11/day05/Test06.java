package month_11.day05;

public class Test06 {
}

/**
 * 61. 旋转链表
 */
class Solution04 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode tmp = head;
        ListNode tmp02 = tmp;
        int size = 0;
        while(head.next != null) {
            head = head.next;
            size ++;
        }
        size++;
        int rotateNum = k%size;
        if(rotateNum == 0) return tmp;
        int holdNum = size - rotateNum;
        for(int i=0; i<holdNum; i++) {
            if(i == holdNum - 1) {
                ListNode x = tmp.next;
                tmp.next = null;
                tmp = x;
            } else {
                tmp = tmp.next;
            }
        }
        ListNode res = tmp;
        while(tmp != null && tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = tmp02;

        return res;
    }
}
