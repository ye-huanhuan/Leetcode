package month_11.day22;

import java.util.LinkedList;
import java.util.Queue;

public class Test33 {
}



// Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    //深搜
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && (isMirror(t1.left, t2.right)) && (isMirror(t1.right, t2.left));
    }

    //广搜
    public boolean isSymmetric02(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null ||(root.left == null && root.right == null)) return true;
        if(root.left != null && root.right != null) {
            qu.add(root.left);
            qu.add(root.right);
        } else {
            return false;
        }
        while(!qu.isEmpty()) {
            TreeNode left = qu.poll();
            TreeNode right = qu.poll();
            if(left == null && right == null) continue;
            if(left == null || right == null || left.val != right.val) return false;
            qu.add(left.left);
            qu.add(right.right);
            qu.add(left.right);
            qu.add(right.left);
        }
        return true;
    }
}