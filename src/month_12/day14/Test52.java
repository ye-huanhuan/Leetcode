package month_12.day14;

public class Test52 {
}

/**
 * 正则表达式匹配
 */
class Solution04 {
    public boolean match(char[] str, char[] pattern) {
        if(str == null || pattern == null) {
            return false;
        }
        return matchCore(str, pattern, 0, 0);
    }

    public boolean matchCore(char[] str, char[] pattern, int strIndex, int patterIndex) {
        //两个字符串都到了末尾
        if(strIndex == str.length && patterIndex == pattern.length) {
            return true;
        }
        //patter到达了末尾，而str没有到达末尾
        if(strIndex < str.length && patterIndex == pattern.length) {
            return false;
        }
        //str达到了末尾，而pattern没有到达末尾
        if(strIndex == str.length && patterIndex < pattern.length) {
            if(patterIndex + 1 < pattern.length && pattern[patterIndex + 1] == '*') {
                return matchCore(str, pattern, strIndex, patterIndex + 2);
            } else {
                return false;
            }
        }
        //str和pattern都没有到达末尾
        if(patterIndex + 1 < pattern.length && pattern[patterIndex + 1] == '*') {
            if(str[strIndex] == pattern[patterIndex] || (pattern[patterIndex] == '.' && strIndex < str.length)) {
                return matchCore(str, pattern, strIndex+1, patterIndex)
                        || matchCore(str, pattern, strIndex+1, patterIndex+2)
                        || matchCore(str ,pattern, strIndex, patterIndex+2);
            } else{        //匹配0个
                return matchCore(str, pattern, strIndex, patterIndex+2);
            }
        }

        if(str[strIndex] == pattern[patterIndex] || (pattern[patterIndex] == '.' && strIndex < str.length)) {
            return matchCore(str, pattern, strIndex+1, patterIndex+1);
        }

        return false;
    }
}