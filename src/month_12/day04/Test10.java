package month_12.day04;

public class Test10 {
}

/**
 * 矩阵覆盖
 */
class Solution04 {
    public int RectCover(int target) {
        if(target == 0) return 0;
        if(target <= 1) {
            return 1;
        } else if(target == 2) {
            return 2;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }
}
