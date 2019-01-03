package month_12.day13;

public class Test44 {
    public static void main(String[] args) {
        String test = "student. a am I";
        Solution02 s2 = new Solution02();
        String res = s2.ReverseSentence(test);
        System.out.println(res);
    }
}

/**
 * 翻转单词顺序列
 */
class Solution02 {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0) return "";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int low = 0;
        int high = words.length-1;
        while(low<high) {
            String tmp = words[low];
            words[low] = words[high];
            words[high] = tmp;
            low++;
            high--;
        }
        for(String s : words) {
            sb.append(s).append(" ");
        }
        return sb.length() > 0 ? sb.toString().substring(0,sb.toString().length()-1) : str;
    }
}