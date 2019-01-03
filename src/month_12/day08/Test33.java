package month_12.day08;

public class Test33 {
    public static void main(String[] args) {
        Solution03 s3 = new Solution03();
        int res = s3.GetUglyNumber_Solution(7);
        System.out.println(res);
    }
}

/**
 * 丑数
 */
class Solution03 {
    public int GetUglyNumber_Solution(int index) {
        if(index<7) {
            return index;
        }
        int p2=0;
        int p3=0;
        int p5=0;
        int[] arr = new int[index];
        arr[0] = 1;
<<<<<<< HEAD
        for(int i=1; i< arr.length; i++) {
=======
        for(int i=1; i<arr.length; i++) {
>>>>>>> f0d62b026fc681ef71e8852d5754e26a406c389e
            arr[i] = Math.min(arr[p2]*2, Math.min(arr[p3]*3, arr[p5]*5));
            if(arr[p2]*2 == arr[i]) {
                p2++;
            }
            if(arr[p3]*3 == arr[i]) {
                p3++;
            }
            if(arr[p5]*5 == arr[i]) {
                p5++;
            }
        }
        return arr[arr.length-1];
    }
}