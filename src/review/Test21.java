package review;

/**
 * 5076. 字符串的最大公因子
 */
public class Test21 {
    public int gcd(int a, int b) {
        if(a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        return a%b == 0 ? b : gcd(b, a%b);
    }

    public boolean check(String sub, String str) {
        int n = sub.length();
        int m = str.length();
        if(m%n != 0) return false;
        for(int i=1; i<=m/n; i++) {
            if(!sub.equals(str.substring((i-1)*n, i*n))) {
                return false;
            }
        }
        return true;
    }

    public String gcdOfStrings(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();
        int gcd = gcd(str1Len, str2Len);
        for(; gcd>0; gcd--) {
            String tmp = str1.substring(0, gcd);
            if(check(tmp, str1) && check(tmp, str2)) {
                return tmp;
            }
        }
        return "";
    }


}
