package review;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  993. 二叉树的堂兄弟节点
 */

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class Test27 {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        Queue<Node> qu = new LinkedList<>();
        qu.add(new Node(null, root));
        while(!qu.isEmpty()) {
            int size = qu.size();
            Node first = null;
            Node seconed = null;
            for(int i=0; i<size; i++) {
                Node tmp = qu.poll();
                TreeNode pa = tmp.parent;
                TreeNode cur = tmp.cur;
                if(cur.val == x || cur.val == y) {
                    if(first == null) {
                        first = new Node(pa, cur);
                    } else {
                        seconed =new Node(pa, cur);
                    }
                }
                if(first != null && seconed != null && first.parent != seconed.parent) {
                   return true;
                }
                if(cur.left != null) {
                    qu.add(new Node(cur,cur.left));
                }
                if(cur.right != null) {
                    qu.add(new Node(cur,cur.right));
                }
            }
        }
        return false;
    }
}

class Node {
    TreeNode parent;
    TreeNode cur;

    public Node(TreeNode parent, TreeNode cur) {
        this.parent = parent;
        this.cur = cur;
    }
}