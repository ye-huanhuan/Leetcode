package month_12.day10;

import month_10.day16.Test19;

public class Test38 {
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Solution02 {
    public int TreeDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return root == null ? 0 : (1 + Math.max(TreeDepth(root.left), TreeDepth(root.right)));
    }
}