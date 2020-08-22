package review;

/**
 * 1037. 有效的回旋镖
 * [[1,1],[2,3],[3,2]]
 */
public class Test15 {
    public boolean isBoomerang(int[][] points) {
        if(points[0][0] == points[1][0] && points[0][1] == points[1][1] ||
                points[0][0] == points[2][0] && points[0][1] == points[2][1] ||
                points[1][0] == points[2][0] && points[1][1] == points[2][1]) {
            return false;
        }
        int x1 = points[1][0] - points[0][0];
        int y1 = points[1][1] - points[0][1];
        int x2 = points[2][0] - points[0][0];
        int y2 = points[2][1] - points[0][1];
        //判断斜率
        return x1*y2 != x2*y1;
    }
}
