package month_10.day15;

public class Test15 {
    public static void main(String[] args) {
        Solution04 s4 = new Solution04();
        boolean result = s4.buddyStrings("b", "ba");
        System.out.println(result);
    }
}

class Solution04 {
    public boolean buddyStrings(String A, String B) {
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        int flag = 0;
        int index = 0;
        char value = ' ';
        if(A.length() != B.length() || A == null || B == null) return false;
        if(A.equals(B)) {
            for(int i=0; i<arrA.length; i++) {
                for(int j=i+1; j<arrA.length; j++) {
                    if(arrA[i] == arrA[j]) return true;
                }
            }
        }
        for(int i=0; i<arrA.length; i++) {
           if(arrB[i] != arrA[i]) {
               if(flag == 0) {
                   index = i;
                   value = arrB[i];
                   flag++;
               } else {
                   arrB[index] = arrB[i];
                   arrB[i] = value;
               }
           }
        }
        return String.valueOf(arrA).equals(String.valueOf(arrB)) && flag == 1 ? true : false;
    }
}
