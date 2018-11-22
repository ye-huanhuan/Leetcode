package month_11.day22;

public class Test33 {
}



// Definition for a binary tree node.
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution03 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) return true;
        if(t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && (isMirror(t1.left, t2.right)) && (isMirror(t1.right, t2.left));
    }
}