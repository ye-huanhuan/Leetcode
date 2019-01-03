package month_12.day03;

public class Test04 {
    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = new Solution04().reConstructBinaryTree(pre, in);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
/**
 * 重建二叉树
 */
class Solution04 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null || pre.length != in.length) {
            return null;
        }
        return constructTree(pre, 0, pre.length-1, in, 0, in.length-1);
    }

    private TreeNode constructTree(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if(ps > pe) return null;
        int value = pre[ps];
        TreeNode node = new TreeNode(value);
        int index = -1;
        for(int i=is; i<=ie; i++) {
            if(in[i] == value) index = i;
        }
        if(index == -1) {
            throw new RuntimeException("输入不合法！");
        }
        node.left = constructTree(pre, ps+1, ps+(index - is), in, is, index-1);
        node.right = constructTree(pre,ps+(index - is +1) , pe,in, index+1, ie);
        return node;
    }

}