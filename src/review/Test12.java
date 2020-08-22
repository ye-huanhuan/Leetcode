package review;

/**
 * 1047. 删除字符串中的所有相邻重复项
 */
public class Test12 {
    public static void main(String[] args) {
        String test ="abbaca";
        Test12 t12 = new Test12();
        String res = t12.removeDuplicates(test);
        System.out.println(res);
    }
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S.length(); i++) {
            if(sb.length() == 0 || sb.charAt(sb.length()-1) != S.charAt(i)) {
                sb.append(S.charAt(i));
            } else {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
