package month_12.day06;

import java.util.ArrayList;

public class Test24 {
}


class Solution06 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        int sum = 0;
        ArrayList<Integer> tmp = new ArrayList<>();
        preorder(res, tmp, root, sum, target);
        res.sort((a,b) -> b.size()-a.size());
        return res;
    }

    public void preorder(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tmp, TreeNode root, int sum, int target) {
        sum += root.val;
        tmp.add(root.val);
        if(root.left == null && root.right == null && sum == target) {
            ArrayList<Integer> path = new ArrayList<>();
            for(int i : tmp) {
                path.add(i);
            }
            res.add(path);
        }
        if(root.left != null) {
            preorder(res, tmp, root.left, sum, target);
        }
        if(root.right != null) {
            preorder(res, tmp, root.right, sum, target);
        }
        tmp.remove(tmp.size()-1);
    }
}