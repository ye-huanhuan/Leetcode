package month_12.day07;

import java.util.HashMap;
import java.util.Map;

public class Test25 {

    public static void main(String[] args) {
        Solution s = new Solution();
        RandomListNode r1 = new RandomListNode(1);
        RandomListNode r2 = new RandomListNode(2);
        RandomListNode r3 = new RandomListNode(3);
        RandomListNode r4 = new RandomListNode(4);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
    }
}

/**
 * 复制链表的复制
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead == null) return null;
        Map<Integer, RandomListNode> map = new HashMap<>();
        RandomListNode curNode = new RandomListNode(0);
        RandomListNode tmp1 = curNode;
        RandomListNode tmp2 = pHead;
        while(pHead != null) {
            curNode.label = pHead.label;
            map.put(pHead.label, curNode);
            RandomListNode newNode = new RandomListNode(0);
            pHead = pHead.next;
            //保证复制出来的最后一个节点为null
            if(pHead == null) {
                break;
            }
            curNode.next = newNode;
            curNode = curNode.next;
        }
        RandomListNode res = tmp1;
        while(tmp1 != null && tmp2 != null) {
            if(tmp2.random != null) {
                tmp1.random = map.get(tmp2.random.label);
            }
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
        return res;
    }
}