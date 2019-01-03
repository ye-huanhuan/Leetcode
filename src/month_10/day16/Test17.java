package month_10.day16;


public class Test17 {
}

/**
 * 判断平衡二叉树
 */
class Solution02 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(deep(root.left) - deep(root.right)) > 1) return false;
        else return (isBalanced(root.left) && isBalanced(root.right));
    }

    public int deep(TreeNode root) {
        if(root == null) return 0;
        return Math.max(deep(root.left), deep(root.right)) + 1;
    }
}