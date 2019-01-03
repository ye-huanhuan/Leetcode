package month_10.day26;

import java.util.ArrayList;
import java.util.List;

public class Test53 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] data = new int[]{1,2,3,4};
        List<List<Integer>> res = s.permute(data);
        System.out.println(res);
    }

}


/**
 * 46 全排列
 *  采用递归的思想，{a,b,c}的全排列是a + {b,c}的全排列 并 b + {a,c}的全排列；
 */
class Solution {
    // 最终返回的结果集
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        if (len==0||nums==null)  return res;

        exchange(nums, 0, len);
        return res;
    }

    public void exchange(int[] nums, int i, int len) {
        //只剩一个元素了，就把该序列加入到结果集中
        if(i==len-1){
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<len; j++){
                list.add(nums[j]);
            }
            res.add(list);
            return ;
        }
        // 固定第一个数，并且向后搜索全排列，交换完成应该将原数组还原
        for (int j=i; j<len; j++) {
            swap(nums, i, j);
            exchange(nums, i+1, len);
            swap(nums, i, j);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}