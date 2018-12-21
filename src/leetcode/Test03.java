package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Test03 {
}

/**
 * 404.左叶子之和
 * 层次遍历，一边遍历一边判断是否为左叶子
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode tmpNode = queue.poll();
            if(tmpNode.left != null) {
                queue.offer(tmpNode.left);
                if(tmpNode.left.left == null && tmpNode.left.right == null) {
                    res += tmpNode.left.val;
                }
            }
            if(tmpNode.right != null) {
                queue.offer(tmpNode.right);
            }
        }

        return res;
    }


}