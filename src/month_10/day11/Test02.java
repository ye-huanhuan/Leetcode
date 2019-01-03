package month_10.day11;

import java.util.Stack;

public class Test02 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n2.next = n3;
        n3.next = n4;
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n4.next = n5;
        n5.next = n6;
        Solution04 s = new Solution04();
        System.out.println(s.isPalindrome(n1));

    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; next = null;}
}

/**
 * 判断回文链表
 */
class Solution03 {
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode x = head;
        while(x.next != null){
            len++;
            x = x.next;
        }
        len++;
        int[] arr = new int[len/2+1];
        for(int i=0; i<len; i++) {
            int tmp = head.val;
            head = head.next;
            if(i <= len/2) {
                arr[i] = tmp;
            }
            if(i >= len/2){
                if(arr[len-i-1] != tmp) {
                    return false;
                }
            }
        }
        return true;
    }
    //利用栈进行对比
    public boolean isPalindrome1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode x = head;
        //入栈
        while(x != null) {
            stack.push(x.val);
            x = x.next;
        }
        //判断
        while(head != null) {
            if(head.val != stack.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}

class Solution04 {
    public boolean isPalindrome1(ListNode head) {

        //  方法1，使用栈，此处 O(n) 时间复杂度和 O(n) 空间复杂度
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }

        while(!stack.isEmpty() && head != null){
            if(head.val != stack.pop()){
                return false;
            }
            head = head.next;
        }

        return true;
    }

    //  方法二，利用快慢指针，找到其中心节点，然后将之后反转，从头开始进行对比
    public boolean isPalindrome(ListNode head){

        //  注意由于有快慢指针，此处需要对只有1个和2个元素的链表进行判断
        if(head == null || head.next == null){
            return true;
        }
        if(head.next.next == null){
            if(head.val == head.next.val){
                return true;
            } else{
                return false;
            }
        }

        ListNode slow = head.next;
        ListNode fast = head.next.next;
        ListNode mid = null;

        while(head.next != null){
            if(fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            } else{
                mid = slow;
                break;
            }
        }

        //  从mid处开始进行反转
        ListNode newHead = null;
        while(mid != null){
            ListNode temp = mid.next;
            mid.next = newHead;
            newHead = mid;
            mid = temp;
        }

        while(head != null && newHead != null){
            if(head.val != newHead.val){
                return false;
            }
            head = head.next;
            newHead = newHead.next;
        }
        return true;
    }

}