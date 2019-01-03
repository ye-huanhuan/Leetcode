package month_12.day05;

public class Test18 {
}

/**
 * 二叉树的镜像
 */
class Solution06 {
    public void Mirror(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if(root.left != null) {
            Mirror(root.left);
        }
        if(root.right != null) {
            Mirror(root.right);
        }
    }
}