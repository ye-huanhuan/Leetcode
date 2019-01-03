package leetcode;

public class Test05 {
    /**
     * 112.路径总和
     * @param root
     * @param sum
     * @return
     */

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        return dfs(root, 0, sum);
    }

    public boolean dfs(TreeNode root, int tmp, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null && (tmp+root.val) == sum) {
            return true;
        }
        return dfs(root.left, tmp+root.val, sum) || dfs(root.right, tmp+root.val, sum);
    }
}
