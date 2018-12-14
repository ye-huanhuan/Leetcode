package month_12.day14;

public class Test50 {
    public static void main(String[] args) {
        Solution02 s2 = new Solution02();
        int[] test = new int[]{2,3,4,3,1};
        int[] res = new int[1];
        boolean b = s2.duplicate(test,5, res);
        System.out.println(b + "   " + res[0]);
    }
}

/**
 *  数组中重复的数字
 *  因为所有的值都是在0---(n-1)，所以可以利用下标操作
 */
class Solution02 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || length == 0) return false;
        for(int i=0; i<length; i++) {
            int index = numbers[i];
            if(index >= length) {
                index -= length;
            }
            //对应下标中的值被改变过，说明该下标就是重复出现的
            if(numbers[index] > length) {
                duplication[0] = index;
                return true;
            }
            numbers[index] = numbers[index] + length;
        }
        return false;
    }
}