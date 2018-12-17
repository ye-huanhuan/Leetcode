package month_12.day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test59 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        Solution05 s5 = new Solution05();
        ArrayList<ArrayList<Integer>> res = s5.Print(t1);
        for(ArrayList<Integer> arr : res) {
            for(Integer i : arr) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

    }
}


class Solution05 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;
        Queue<TreeNode> queue01 = new LinkedList<>();
        Queue<TreeNode> queue02 = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue01.offer(pRoot);
        int flag = 0;
        while(true) {
            if(queue01.isEmpty() && queue02.isEmpty()) break;
            if(flag == 0) {
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!queue01.isEmpty()) {
                    TreeNode t = queue01.poll();
                    tmp.add(t.val);
                    if(t.left != null) {
                        queue02.offer(t.left);
                    }
                    if(t.right != null) {
                        queue02.offer(t.right);
                    }
                }
                res.add(tmp);
                flag = 1;
                continue;
            }
            if(flag == 1) {
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!queue02.isEmpty()) {
                    TreeNode t = queue02.poll();
                    stack.push(t.val);
                    if(t.left != null) {
                        queue01.offer(t.left);
                    }
                    if(t.right != null) {
                        queue01.offer(t.right);
                    }

                }
                while(!stack.isEmpty()) {
                    tmp.add(stack.pop());
                }
                res.add(tmp);
                flag = 0;
                continue;
            }

        }
        return res;
    }

}