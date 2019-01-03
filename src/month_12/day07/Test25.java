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
<<<<<<< HEAD
 * 复制链表的复制
=======
 * 复杂链表的复制
 * 思路1：使用map先将新创建的每个节点保存起来，最后遍历原链表的random指针从map里面取值即可
 * 思路2：
         1、复制每个节点，如：复制节点A得到A1，将A1插入节点A后面
         2、遍历链表，A1->random = A->random->next;
         3、将链表拆分成原链表和复制后的链表
>>>>>>> f0d62b026fc681ef71e8852d5754e26a406c389e
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