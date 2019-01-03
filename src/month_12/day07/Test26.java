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
<<<<<<< HEAD
        if(pRootOfTree==null)
            return null;
        if(pRootOfTree.left==null&&pRootOfTree.right==null)
            return pRootOfTree;
        // 1.将左子树构造成双链表，并返回链表头节点
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode p = left;
        // 2.定位至左子树双链表最后一个节点
        while(p!=null&&p.right!=null){
            p = p.right;
        }
        // 3.如果左子树链表不为空的话，将当前pRootOfTree追加到左子树链表
        if(left!=null){
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }
        // 4.将右子树构造成双链表，并返回链表头节点
        TreeNode right = Convert(pRootOfTree.right);
        // 5.如果右子树链表不为空的话，将该链表追加到pRootOfTree节点之后
        if(right!=null){
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        return left!=null?left:pRootOfTree;
=======
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
>>>>>>> f0d62b026fc681ef71e8852d5754e26a406c389e
    }
}