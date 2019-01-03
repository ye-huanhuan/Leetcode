package month_12.day18;

public class Test61 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        Solution s = new Solution();
        String res = s.Serialize(t1);
        System.out.println(res);
        TreeNode root = s.Deserialize(res);

    }

}


/**
 * 序列化二叉树
 */
class Solution {

    int index = -1;
    StringBuilder sb = new StringBuilder();
    //前序遍历二叉树，如果为空设置为"#"
    String Serialize(TreeNode root) {
        if(root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        Serialize(root.left);
        Serialize(root.right);
        return sb.toString();
    }
    TreeNode Deserialize(String str) {
        index++;
        String[] strs = str.split(",");
        TreeNode node = null;
        if (!strs[index].equals("#")) {
            node = new TreeNode(Integer.valueOf(strs[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}