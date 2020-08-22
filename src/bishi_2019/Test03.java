package bishi_2019;


import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

/**
 * 树的逐层打印
 */
public class Test03 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode tn = queue.poll();
                if(tn.left != null) {queue.add(tn.left);}
                if(tn.right != null) {queue.add(tn.right);}
                tmp.add(tn.val);
            }
            res.add(tmp);
        }
        return res;
    }

    //使用递归的方式
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder02(TreeNode root) {
        if(root == null) return res;
        else help(root, 0);
        return res;
    }

    public void help(TreeNode node, int level) {
        if(res.size() == level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        if(node.left != null) {
            help(node.left, level + 1);
        }
        if(node.right != null) {
            help(node.right, level + 1);
        }
    }
}
