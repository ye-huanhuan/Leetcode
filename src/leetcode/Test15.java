package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Test15 {

    public static void main(String[] args) {
        int[] test = new int[]{2,3,5};
        Test15 t15 = new Test15();
        List<List<Integer>> res = t15.combinationSum(test, 8);
        for(List list : res) {
            for(Object i : list) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }

    /**
     * 组合总和
     * @param candidates
     * @param target
     * @return
     */

    private static List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0) return res;
        List<Integer> tmp = new ArrayList<>();
        dfs(tmp, candidates, target, 0);
        return res;
    }

    public void dfs(List<Integer> tmp, int[] candidates, int target, int start) {
        if(target < 0) {
            return;
        }
        if(target == 0) {
            List<Integer> list = new ArrayList<>();
            for(Integer i : tmp) {
                list.add(i);
            }
            res.add(list);
            return;
        }
        for(int i=start; i<candidates.length; i++) {
            if(candidates[i] <= target) {
                tmp.add(candidates[i]);
                dfs(tmp, candidates, target-candidates[i], i);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
