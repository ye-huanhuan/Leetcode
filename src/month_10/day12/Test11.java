package month_10.day12;

public class Test11 {
}

/**
 * 机器人能否回到原点
 */
class Solution04 {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int ud = 0;
        int lf = 0;
        for(char c : chars) {
            if(c == 'U') ud++;
            else if(c == 'D') ud--;
            else if(c == 'L') lf--;
            else if(c == 'R') lf++;
            else throw new IllegalArgumentException("无效操作");
        }
        return ud == 0 && lf == 0;
    }
}
