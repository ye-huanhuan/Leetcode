package month_10.day12;

public class Test09 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t1.left = t2;
        System.out.println(new Solution02().minDepth(t1));

    }
}


//  Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

/**
 * 二叉树的最大深度
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
}

/**
 * 二叉树的最小深度：根节点到叶子节点的最短距离
 */
class Solution02 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        else if(root.left == null && root.right == null) return 1;
        else if(root.left != null && root.right == null) return 1 + minDepth(root.left);
        else if(root.right != null && root.left == null) return 1 + minDepth(root.right);
        else return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}
