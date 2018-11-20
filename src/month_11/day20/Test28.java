package month_11.day20;

public class Test28 {
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

/**
 * 700. 二叉搜索树中的搜索
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        while(root != null) {
            if(root.val > val) {
                root = root.left;
            } else if(root.val < val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}