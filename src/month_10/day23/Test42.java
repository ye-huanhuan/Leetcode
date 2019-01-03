package month_10.day23;

public class Test42 {
}

/**
 * 两数之和II
 */
class Solution04 {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0 || numbers.length == 1) return new int[]{-1,-1};
        if(numbers.length == 2 && numbers[0] + numbers[1] != target) return new int[]{-1,-1};
        int i = 0;
        int j = numbers.length-1;
        while(i != j) {
            if(numbers[i] + numbers[j] == target) return new int[]{i+1,j+1};
            else if(numbers[i] + numbers[j] > target) j--;
            else i++;
        }
        return new int[]{-1,-1};
    }
}
