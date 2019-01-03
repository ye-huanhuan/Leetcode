package month_12.day17;

public class Test58 {
}


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

/**
 * 对称的二叉树
 */
class Solution04 {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot == null) return true;
        return judge(pRoot.left, pRoot.right);
    }

    boolean judge(TreeNode left, TreeNode right) {
        if(left == null && right != null) return false;
        if(left != null && right == null) return false;
        if(left == null && right == null) return true;
        if(left.val != right.val) return false;
        return judge(left.left, right.right) && judge(left.right, right.left);
    }
}