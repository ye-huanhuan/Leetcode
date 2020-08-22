package nowcode;

public class IsValidBST {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }

    public boolean isInBetwen(TreeNode root, Integer min, Integer max) {
        if(root == null) {
            return true;
        }
        if((min == null && root.val >= max) || (max == null && root.val <= min)) {
            return false;
        }
        return isInBetwen(root.left, min, max) && isInBetwen(root.right, min, max);
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isInBetwen(root.left, null, root.val) && isInBetwen(root.right, root.val, null) && isValidBST(root.left) && isValidBST(root.right);
    }
}
