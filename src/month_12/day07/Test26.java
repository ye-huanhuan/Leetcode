package month_12.day07;

public class Test26 {
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

/**
 * 二叉搜索树与双向链表
 */
class Solution02 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) {
            return null;
        }
        if(pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        TreeNode left = Convert(pRootOfTree.left);
        //找到最大的节点，也就是链表最后一个节点，将其连接根节点
        if(left != null) {
            TreeNode tmp = left;
            while(tmp.right != null) {
                tmp = tmp.right;
            }
            tmp.right = pRootOfTree;
            //只是改变了pRootOfTree的左指针，右指针并没有被改变
            pRootOfTree.left = tmp;
        }

        TreeNode right = Convert(pRootOfTree.right);
        //将右边节点连接根节点
        if(right != null) {
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return left != null ? left : pRootOfTree;
    }
}