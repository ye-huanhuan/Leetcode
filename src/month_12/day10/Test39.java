package month_12.day10;

public class Test39 {
}

/**
 * 平衡二叉树
 */
class Solution03 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(Math.abs(TreeDepth(root.left) - TreeDepth(root.right)) > 1) {
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int TreeDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return root == null ? 0 : (1 + Math.max(TreeDepth(root.left), TreeDepth(root.right)));
    }
}