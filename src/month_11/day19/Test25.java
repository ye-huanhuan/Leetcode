package month_11.day19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test25 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        Node node6 = new Node(6, null);
        Node node5 = new Node(5, null);
        Node node0 = new Node(0, null);
        List<Node> list5 = new ArrayList<>();
        list5.add(node5);
        list5.add(node0);
        Node node10 = new Node(10, list5);
        List<Node> list6 = new ArrayList<>();
        list6.add(node6);
        Node node3 = new Node(3, list6);
        List<Node> list10 = new ArrayList<>();
        list10.add(node10);
        list10.add(node3);
        Node node1 = new Node(1, list10);
        List<List<Integer>> res = s3.levelOrder(node1);
        System.out.println(res);
    }
}


/**
 * 429. N叉树的层序遍历
 */
class Solution03 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for(int i=0; i<size; i++) {
                Node n = queue.poll();
                tmp.add(n.val);
                if(n.children == null) continue;
                for(Node node : n.children) {
                    queue.add(node);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
