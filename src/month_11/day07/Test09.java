package month_11.day07;

import java.util.ArrayList;
import java.util.List;

public class Test09 {
}

/**
 * 230. 二叉搜索树中第K小的元素
 */

//  Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
class Solution02 {
    private List<Integer> res = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        if(res.size() < k) return -1;
        return res.get(k-1);
    }

    private void dfs(TreeNode root) {
        if(root == null) return ;
        dfs(root.left);
        res.add(root.val);
        dfs(root.right);
    }
}

class Solution03 {

    public int kthSmallest(TreeNode root, int k) {
        int num = count(root);
        if(num == k-1){
            return root.val;
        } else if(num < k-1) {
            //往右孩子查找时注意k的值
            return kthSmallest(root.right, k - (num + 1));
        } else {
            return kthSmallest(root.left, k);
        }

    }

    private int count(TreeNode root) {
        if(root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }
}