package leetcode;

public class Test06 {
    /**
     * 将有序数组转换为二叉搜索树
     * 思路：每次找数组中间值，树的每一层就是数组分治之后的中间节点
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return dfs(nums, 0, nums.length-1);
    }

    public TreeNode dfs(int[] nums, int low, int high) {
        if(low >= high) {
            return null;
        }
        int mid = (low + high)/2;
        TreeNode tmpNode = new TreeNode(nums[mid]);
        //左子树为左边中间节点
        tmpNode.left = dfs(nums, low, mid-1);
        //右子树为右边中间节点
        tmpNode.right = dfs(nums, mid+1, high);
        return tmpNode;
    }
}
