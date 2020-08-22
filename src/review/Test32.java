package review;

/**
 * 1103. 分糖果 II
 */
public class Test32 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int cur_num = 1;
        int cur_index = 0;
        while(true) {
            if(candies <= cur_num) {
                res[cur_index] += candies;
                break;
            }
            res[cur_index] += cur_num;
            candies -= cur_num;
            cur_num++;
            cur_index++;
            if(cur_index >= res.length) {
                cur_index = 0;
            }
        }
        return res;
    }
}
