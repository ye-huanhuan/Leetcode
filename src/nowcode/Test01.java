package nowcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Test01 {
    /**
     * 一个一维维数组中只有1和-1，实现程序，求和为0的最长子串长度，并在注释中给出时间和空间复杂度。
     * @param array
     * @return
     */
    public int getLongestLength(List<Integer> array){
        //   TODO
        if(array.size() == 0) return 0;
        int[] dp = new int[array.size()];
        dp[0] = array.get(0);
        for(int i=1; i< array.size(); i++) {
            dp[i] = dp[i-1] + array.get(i);
        }
        int res = -1;
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        for(int j=0; j<dp.length; j++) {
            int beginIndex = sumToIndex.getOrDefault(dp[j],-1);
            if(dp[j] != 0 && beginIndex == -1) {
                sumToIndex.put(dp[j], j);
            } else if(dp[j] == 0){
                if((j+1) >= res) {
                    res = j+1;
                }
            } else {
                if((j - beginIndex + 1) >= res) {
                    res = j - beginIndex + 1;
                }
            }
        }
        return res;
    }
}
