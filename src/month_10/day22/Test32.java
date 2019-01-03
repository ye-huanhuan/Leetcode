package month_10.day22;


public class Test32 {
}


//  Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

/**
 * 搜索树两节点的最近公共祖先
 */
class Solution04 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        while(root != null) {
            if(p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if(p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}