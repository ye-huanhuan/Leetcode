package leetcode;

import java.util.*;

public class Test12 {

    /**
     * 二叉树的层次遍历II
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> tmp = levelOrder(root);
        Stack<List<Integer>> stack = new Stack<>();
        for(int i=0; i<tmp.size(); i++) {
            stack.add(tmp.get(i));
        }
        tmp.clear();
        while(!stack.isEmpty()){
            tmp.add(stack.pop());
        }
        return tmp;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>(size);
            for(int i=0; i<size; i++) {
                TreeNode tmpNode = queue.poll();
                tmp.add(tmpNode.val);
                if(tmpNode.left != null) {
                    queue.offer(tmpNode.left);
                }
                if(tmpNode.right != null) {
                    queue.offer(tmpNode.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
