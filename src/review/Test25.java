package review;

/**
 * 1089. 复写零
 */
public class Test25 {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                res[index++] = 0;
                if(index >= arr.length) {
                    break;
                }
                res[index++] = 0;
                if(index >= arr.length) {
                    break;
                }
            } else {
                res[index++] = arr[i];
                if(index >= arr.length) {
                    break;
                }
            }

        }
        for(int i=0; i<arr.length; i++) {
            arr[i] = res[i];
        }
    }
}
