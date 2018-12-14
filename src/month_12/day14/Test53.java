package month_12.day14;

public class Test53 {
}

/**
 * 表示数值的字符串
 */
class Solution05 {
    public boolean isNumeric(char[] str) {
        String string = new String(str);
        return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }
}