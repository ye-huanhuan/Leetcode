package month_10.day17;

public class Test25 {
}



//  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


/**
 * 两数相加
 */
class Solution03 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode res = pre;
        int flag = 0;
        if(l1 == null && l2 == null) return null;
        else if(l1 != null && l2 == null) return l1;
        else if(l1 == null && l2 != null) return l2;
        else {
            if(l1.val + l2.val >= 10) {
                flag = 1;
                pre.val = (l1.val + l2.val)%10;
            }else {
                pre.val = l1.val + l2.val;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null || l2 != null) {
            ListNode cur = new ListNode(0);
            if(l1 != null && l2 != null) {
                if((l1.val + l2.val >= 9 && flag == 1) || l1.val + l2.val >= 10) {
                    cur.val = (l1.val + l2.val + flag) % 10 ;
                    pre.next = cur;
                    pre = cur;
                    flag = 1;
                } else {
                    cur.val = (l1.val + l2.val) + flag;
                    pre.next = cur;
                    pre = cur;
                    flag = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1 != null && l2 == null) {
                if(l1.val >= 9 && flag == 1) {
                    cur.val = (l1.val + flag) % 10;
                    pre.next = cur;
                    pre = cur;
                    flag = 1;
                } else {
                    cur.val = l1.val + flag;
                    pre.next = cur;
                    pre = cur;
                    flag = 0;
                }
                l1 = l1.next;
            } else {
                if(l2.val >= 9 && flag == 1) {
                    cur.val = (l2.val + flag) % 10;
                    pre.next = cur;
                    pre = cur;
                    flag = 1;
                } else {
                    cur.val = l2.val + flag;
                    pre.next = cur;
                    pre = cur;
                    flag = 0;
                }
                l2 = l2.next;
            }

        }
        return res;
    }
}
