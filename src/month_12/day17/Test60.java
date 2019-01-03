package month_12.day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test60 {
}


/**
 * 把二叉树打印成多行
 */
class Solution06 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        Queue<TreeNode> queue01 = new LinkedList<>();
        Queue<TreeNode> queue02 = new LinkedList<>();
        queue01.offer(pRoot);
        int flag = 0;
        while(true) {
            if(queue01.isEmpty() && queue02.isEmpty()) break;
            if(flag == 0) {
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!queue01.isEmpty()) {
                    TreeNode t = queue01.poll();
                    if(t.left != null) {
                        queue02.offer(t.left);
                    }
                    if(t.right != null) {
                        queue02.offer(t.right);
                    }
                    tmp.add(t.val);
                }
                res.add(tmp);
                flag = 1;
                continue;
            }
            if(flag == 1) {
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!queue02.isEmpty()) {
                    TreeNode t = queue02.poll();
                    if(t.left != null) {
                        queue01.offer(t.left);
                    }
                    if(t.right != null) {
                        queue01.offer(t.right);
                    }
                    tmp.add(t.val);
                }
                res.add(tmp);
                flag = 0;
                continue;
            }
        }
        return res;
    }

    ArrayList<ArrayList<Integer>> Print02(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        while(!queue.isEmpty()) {
            ArrayList<Integer> tmp  =new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++) {
                TreeNode t = queue.poll();
                if(t.left != null) {
                    queue.offer(t.left);
                }
                if(t.right != null) {
                    queue.offer(t.right);
                }
                tmp.add(t.val);
            }
            res.add(tmp);
        }
        return res;
    }

}