package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test08 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = null;
        t2.right = t5;
        t3.left = null;
        t3.right = null;
        t5.left = null;
        t5.right = null;
        Test08 test08 = new Test08();
        List<String> res = test08.binaryTreePaths(t1);
        for(String str : res) {
            System.out.println(str);
        }
    }
    /**
     * 二叉树的所有路径
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        dfs(res, "", root);
        return res;
    }

    public void dfs(List<String> res, String tmp, TreeNode root) {
        if(root.left == null && root.right == null) {
            res.add(tmp + root.val);
            return;
        }
        if(root.left != null) {
            dfs(res, tmp + root.val + "->", root.left);
        }
        if(root.right != null) {
            dfs(res, tmp + root.val + "->", root.right);
        }
    }
}
