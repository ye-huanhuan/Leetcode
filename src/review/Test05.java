package review;

import java.util.ArrayList;
import java.util.List;

public class Test05 {

    public static void main(String[] args) {
        Test05 t5 = new Test05();
        List<String> res = t5.letterCasePermutation("a1b");
        for(String s : res) {
            System.out.println(s);
        }
    }

    /**
     * 字母大小写全排列
     * 使用回溯算法，先将本身加入，之后将其对应的大写或者小写加入
     */
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        if(S == null || S.length() == 0) {
            res.add("");
            return res;
        }
        letterCasePermutationCore(res, 0, S, "");
        return res;
    }

    private void letterCasePermutationCore(List<String> res, int index, String S, String tmp) {
        if(tmp.length() == S.length()) {
            res.add(tmp.toString());
        }
        if(index == S.length()) {
            return;
        }

        char cur = S.charAt(index);
        letterCasePermutationCore(res, index+1, S, tmp + cur);
        tmp.substring(0,index);
        if(cur >= 'a' && cur <= 'z') {
            letterCasePermutationCore(res, index+1, S, tmp + ((char)(cur + ('A' - 'a'))));
        } else if(cur >= 'A' && cur <= 'Z') {
            letterCasePermutationCore(res, index+1, S, tmp + ((char)(cur + ('a' - 'A'))));
        }

    }
}
