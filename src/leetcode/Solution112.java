package leetcode;

/**
 * DATE: 2020/8/22
 * DESCRIPTION: 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的节点。
 * CREATE BY: yehuanhuan
 */
public class Solution112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        return dfs(root, sum);
    }

    public boolean dfs(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        return dfs(root.left, sum-root.val) || dfs(root.right, sum-root.val);
    }
}
