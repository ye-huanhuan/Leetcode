package month_12.day13;

public class Test45 {
}

/**
 * 扑克牌顺子
 */
class Solution03 {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length < 5) return false;
        int[] counts = new int[14];
        int max = -1;
        int min = 14;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == 0) {
                continue;
            }
            counts[numbers[i]] ++;
            if(counts[numbers[i]] > 1) {
                return false;
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
            if(numbers[i] < min) {
                min = numbers[i];
            }

        }
        return (max - min) < 5 ? true : false;
    }
}