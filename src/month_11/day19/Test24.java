package month_11.day19;

import java.util.ArrayList;
import java.util.List;

public class Test24 {
    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        Node node2 = new Node(2, null);
        Node node4 = new Node(4, null);
        Node node5 = new Node(5, null);
        Node node6 = new Node(6, null);
        List<Node> list5 = new ArrayList<>();
        list5.add(node5);
        list5.add(node6);
        Node node3 = new Node(3, list5);
        List<Node> list3 = new ArrayList<>();
        list3.add(node3);
        list3.add(node2);
        list3.add(node4);
        Node node1 = new Node(1, list3);
        List<Integer> res = s2.preorder(node1);
        System.out.println(res);
    }
}


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}

/**
 * 589. N叉树的前序遍历
 */
class Solution02 {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        preode(root, res);
        return res;
    }

    public void preode(Node root, List<Integer> res) {
        res.add(root.val);
        if(root.children == null) return;
        for(Node node : root.children) {
            preode(node, res);
        }
    }
}
