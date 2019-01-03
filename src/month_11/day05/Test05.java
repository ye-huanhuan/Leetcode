package month_11.day05;

public class Test05 {
}

/**
 * 231. 2的幂
 */
class Solution03 {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return (n&(n-1)) == 0;
    }
}
