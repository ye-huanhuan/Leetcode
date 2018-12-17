package month_12.day17;

public class Test57 {
    public static void main(String[] args) {

    }
}

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

class Solution03 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null) return null;
        //该节点的右孩子存在；追溯右孩子的左孩子
        if(pNode.right != null) {
            TreeLinkNode tmpNode = pNode.right;
            while(tmpNode.left != null) {
                tmpNode = tmpNode.left;
            }
            return tmpNode;
        }
        //该节点的右孩子不存在，并且是父亲节点的左孩子，就返回其父节点；如果不是左孩子就继续向上追溯，直到是父亲的左孩子
        while(pNode.next != null) {
            if(pNode == pNode.next.left) {
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;
    }
}