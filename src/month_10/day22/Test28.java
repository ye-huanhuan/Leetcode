package month_10.day22;

public class Test28 {

    public static void main(String[] args) {
        String name = "leelee";
        String typed = "lleeelee";
        Solution s = new Solution();
        boolean res = s.isLongPressedName(name, typed);
        System.out.println(res);
    }
}

/**
 * 长按键入
 */
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char[] arrName = name.toCharArray();
        char[] arrTyped = typed.toCharArray();
        if(arrName.length > arrTyped.length || arrName[0] != arrTyped[0]) return false;
        int i = 0;
        int j = 0;
        while(i<arrName.length && j < arrTyped.length) {
            if(arrName[i] == arrTyped[j]) {
                j++;
                i++;
            } else {
                if(arrTyped[j] == arrName[i-1]) {
                    i--;
                } else {
                    return false;
                }
            }
        }
        for(;j<arrTyped.length;j++) {
            if(arrTyped[j] != arrName[i-1]) return false;
        }
        for(;i<arrName.length;i++) {
            if(arrTyped[j-1] != arrName[i]) return false;
        }
        return true;
    }
}
