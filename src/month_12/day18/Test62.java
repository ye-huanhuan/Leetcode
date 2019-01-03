package month_12.day18;

public class Test62 {
    public static void main(String[] args) {
        //8,6,10,5,7,9,11
        TreeNode t8 = new TreeNode(8);
        TreeNode t6 = new TreeNode(6);
        TreeNode t10 = new TreeNode(10);
        TreeNode t5 = new TreeNode(5);
        TreeNode t7 = new TreeNode(7);
        TreeNode t9 = new TreeNode(9);
        TreeNode t11 = new TreeNode(11);
        t8.left = t6;
        t8.right = t10;
        t6.left = t5;
        t6.right = t7;
        t10.left = t9;
        t10.right = t11;
        Solution02  s2 = new Solution02();
        TreeNode res = s2.KthNode(t8, 3);
        System.out.println(res.val);

    }
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
 * 二叉搜索树的第k个结点
 */
class Solution02 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot == null) return null;
        int num = count(pRoot.left);
        if(num == k-1) {
            return pRoot;
        } else if(num < k-1) {
            return KthNode(pRoot.right, k - (num+1));
        } else {
            return KthNode(pRoot.left, k);
        }
    }

    private int count(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }
}