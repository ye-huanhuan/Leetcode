package month_12.day18;

public class Test66 {
}

/**
 * 机器人的运动范围
 */
class Solution06 {
    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        return fromHere(threshold, rows, cols, visited, 0, 0);
    }
    public int fromHere(int threshold, int rows, int cols, boolean[][] visited, int i, int j) {
        if(i<0 || j<0 || i>=rows || j >= cols || visited[i][j] || bitSum(i ,j) > threshold) {
            return 0;
        }
        visited[i][j] = true;
        return 1 + fromHere(threshold, rows, cols, visited, i+1, j) +
                fromHere(threshold, rows, cols, visited, i, j+1) +
                fromHere(threshold, rows, cols, visited, i-1, j) +
                fromHere(threshold, rows, cols, visited, i, j-1);
    }

    private int bitSum(int i, int j) {
        int sum = 0;
        while(i%10 != 0) {
            sum += i%10;
            i /= 10;
        }
        while(j%10 != 0) {
            sum += j%10;
            j /= 10;
        }
        return sum;
    }
}