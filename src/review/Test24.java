package review;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078. Bigram 分词
 */
public class Test24 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] textArr = text.split(" ");
        List<String> strs = new ArrayList<>();
        for(int i=0; i<textArr.length-2; i++) {
            if(textArr[i].equals(first) && textArr[i+1].equals(second)) {
                strs.add(textArr[i+2]);
            }
        }
        String[] res = new String[strs.size()];
        int i = 0;
        for(String str : strs) {
            res[i] = str;
            i++;
        }
        return res;
    }
}
