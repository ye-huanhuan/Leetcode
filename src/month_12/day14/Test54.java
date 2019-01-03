package month_12.day14;

public class Test54 {
}

/**
 * 字符流中第一个不重复的字符
 */
class Solution06 {
    //Insert one char from stringstream
    private int[] tmp = new int[256];
    int seq = 1;
    public void Insert(char ch) {
        if(tmp[ch] == 0) {
            tmp[ch] = seq++;
        } else {
            tmp[ch] = -1;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        int min = Integer.MAX_VALUE;
        char ch = '#';
        for(int i=0; i<tmp.length; i++) {
            if(tmp[i] != -1 && tmp[i] != 0 && tmp[i] < min) {
                min = tmp[i];
                ch = (char)i;
            }
        }
        return ch;
    }
}