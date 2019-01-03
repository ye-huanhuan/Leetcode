package month_11.day12;

import java.util.ArrayList;
import java.util.List;

public class Test16 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        List<List<Integer>> res = s3.subsets(new int[]{1,2,3});
        for(List<Integer> list : res) {
            for(Integer i : list) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}

/**
 * 78. 子集
 * 思路：使用回溯算法，相当于一个二叉树[]
 *                    []
 *              /                \
             [1]                  []
           /     \               /  \
       [1 2]       [1]       [2]     []
     /     \     /   \     /   \    / \
 [1 2 3] [1 2] [1 3] [1] [2 3] [2] [3] []
 */
class Solution03 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        dfs(res, tmp, nums, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> tmp, int[] nums, int j) {
        res.add(new ArrayList<>(tmp));
        for(int i=j; i<nums.length; i++) {
            //存在该元素
            tmp.add(nums[i]);
            dfs(res, tmp, nums, i+1);
            //不存在该元素
            tmp.remove(tmp.size()-1);
        }
    }
}