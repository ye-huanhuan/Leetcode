package bishi;

/**
 * 可以优化，反转a,b完，计算过程到最后c就是头
 */
class ListNode {
    int val;
    ListNode next;
     ListNode(int x) { val = x; }
}

public class Xiaoniangao {

    public static void main(String[] args) {
        Xiaoniangao xng = new Xiaoniangao();
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(8);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
//        l6.next = null;

        ListNode ln1 = new ListNode(8);
        ListNode ln2 = new ListNode(9);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(2);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
        ln4.next = ln5;
//        ln5.next = null;

//        ListNode head = xng.reverseList(l1);
//        System.out.println(head.val);
        ListNode head = xng.addList(l1, ln1);
//        System.out.println(head.val);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode addList(ListNode listNode1, ListNode listNode2) {
        if(listNode1 == null) return listNode2;
        if(listNode2 == null) return listNode1;
        ListNode resNode = new ListNode(0);
        ListNode tarNode = resNode;
        //将链表反转求和
        ListNode revNode1 = reverseList(listNode1);
        ListNode revNode2 = reverseList(listNode2);
        //标志是否进位
        int flag = 0;
        while(revNode1 != null && revNode2 != null) {
            int tmp = revNode1.val + revNode2.val + flag;
            if(tmp >= 10) {
                resNode.val = tmp%10;
                flag = 1;
            } else {
                resNode.val = tmp;
                flag = 0;
            }
            ListNode newNode = new ListNode(0);
//            System.out.println(resNode.val);
            resNode.next = newNode;
            resNode = resNode.next;
            revNode1 = revNode1.next;
            revNode2 = revNode2.next;
        }
        //补齐剩下的数
        if(revNode1 != null) {
            while(revNode1 != null) {
                int tmp = revNode1.val + flag;
                if(tmp >= 10) {
                    resNode.val = tmp%10;
                    flag = 1;
                } else {
                    resNode.val = tmp;
                    flag = 0;
                }
                ListNode newNode = new ListNode(0);
//                System.out.println(resNode.val);
                resNode.next = newNode;
                resNode = resNode.next;
                revNode1 = revNode1.next;
            }
        }

        if(revNode2 != null) {
            while(revNode2 != null) {
                int tmp = revNode2.val + flag;
                if(tmp >= 10) {
                    resNode.val = tmp%10;
                    flag = 1;
                } else {
                    resNode.val = tmp;
                    flag = 0;
                }
                ListNode newNode = new ListNode(0);
//                System.out.println(resNode.val);
                resNode.next = newNode;
                resNode = resNode.next;
                revNode2 = revNode2.next;
            }
        }
        //反转回来,去除头多的一个节点
        return reverseList(tarNode).next;
    }

    //利用双指针反转链表
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode curnode = head;
        ListNode prenode = null;
        while(head != null) {
            head = head.next;
            curnode.next = prenode;
            prenode = curnode;
            curnode = head;
        }
        return prenode;
    }
}
