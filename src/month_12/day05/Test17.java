package month_12.day05;

public class Test17 {
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
 *树的子结构
 */
class Solution05 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean res = false;
        if(root1 != null && root2 != null) {
            if(root1.val == root2.val) {
                res = sameTowTree(root1, root2);
            }
            if(!res) {
                res = HasSubtree(root1.left, root2);
            }
            if(!res) {
                res = HasSubtree(root1.right, root2);
            }
        }
        return res;
    }

    public boolean sameTowTree(TreeNode r1, TreeNode r2) {

        if(r2 == null) {
            return true;
        }
        if(r1 == null) {
            return false;
        }
        if(r1.val != r2.val) {
            return false;
        }
        return sameTowTree(r1.left, r2.left) && sameTowTree(r1.right, r2.right);
    }
}