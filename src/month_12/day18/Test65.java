package month_12.day18;

public class Test65 {
    public static void main(String[] args) {
        char[] test = new char[]{ 'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e',};
        Solution05 s5 = new Solution05();
        boolean res = s5.hasPath(test, 3, 4, "abcb".toCharArray());
        System.out.println(res);
    }
}

/**
 * 矩阵中的路径
 */
class Solution05 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] visited = new boolean[rows*cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(searchFromHere(matrix, rows, cols, i, j, 0, str, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchFromHere(char[] matrix, int rows, int cols, int i, int j, int index, char[] str, boolean[] visited) {
        if(i >= rows || j >= cols || i < 0 || j < 0 || matrix[i*cols + j] != str[index] || visited[i*cols + j] == true) {
            return false;
        }
        if(index == str.length - 1) return true;
        //该位置的值被访问过了
        visited[i*cols + j] = true;
        if(searchFromHere(matrix, rows, cols, i-1, j, index+1, str, visited) ||
                searchFromHere(matrix, rows, cols, i+1, j, index+1, str, visited) ||
                searchFromHere(matrix, rows, cols, i, j-1, index+1, str, visited) ||
                searchFromHere(matrix, rows, cols, i, j+1, index+1, str, visited)) {
            return true;
        }
        //如果没有走通，就需要把访问过的值设置成未访问
        visited[i*cols + j] = false;
        return false;
    }
}