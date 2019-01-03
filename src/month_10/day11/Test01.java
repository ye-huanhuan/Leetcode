package month_10.day11;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(3/2);

    }
}

class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = true;
        String str = String.valueOf(x);
        for(int i=0; i<=str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                flag = false;
            }
        }
        return flag;
    }
}

class Solution02 {
    public boolean isPalindrome(int x) {

        if(x < 0) {
            return false;
        }

        int newNum = 0;
        while (x>newNum) {
            newNum = newNum*10 + x%10;
            x = x/10;
        }

        return newNum == x || x/10 == newNum;
    }
}
