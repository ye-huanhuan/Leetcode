package leetcode;

import java.util.ArrayList;
import java.util.List;

// 叶子相似的树
public class Test17 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list01 = new ArrayList<>();
        List<Integer> list02 = new ArrayList<>();
        dfs(root1, list01);
        dfs(root2, list02);
        return list01.equals(list02);
    }

    public void dfs(TreeNode root, List<Integer> list) {
        if(root != null) {
            if(root.left == null && root.right == null) {
                list.add(root.val);
            }
            dfs(root.left, list);
            dfs(root.right, list);
        }
    }
}



