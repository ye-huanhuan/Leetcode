package month_10.day29;

import java.util.HashSet;
import java.util.Set;

public class Test55 {

}

/**
 * 929. 独特的电子邮件地址
 */

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> avidEmail = new HashSet<>();
        for(String email : emails) {
            String[] strs = email.split("@");
            int addIndex = strs[0].indexOf('+');
            strs[0] = strs[0].substring(0, addIndex);
            strs[0] = strs[0].replaceAll(".", "");
            avidEmail.add(strs[0] + strs[1]);
        }
        return avidEmail.size();
    }
}