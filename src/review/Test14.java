package review;

/**
 * 1041. 困于环中的机器人
 * 思路：如果存在环，最多四次重复指令就能回到原点
 */

public class Test14 {
    public boolean isRobotBounded(String instructions) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0;
        int y = 0;
        int dir = 0;
        for(int i=0; i<4; i++) {
            for(char c : instructions.toCharArray()) {
                if(c == 'G') {
                    x += dx[dir];
                    y += dy[dir];
                } else if(c == 'L') {
                    dir = (dir + 1) % 4;
                } else {
                    dir = (dir + 3) % 4;
                }
            }
        }
        return x == 0 && y == 0 && dir == 0;
    }
}
