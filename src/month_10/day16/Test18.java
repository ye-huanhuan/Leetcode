package month_10.day16;

import java.util.Arrays;

public class Test18 {
}

/**
 * 合并两个有序数组
 */
class Solution03 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m + n];
        int index = 0;
        int i = 0;
        int j = 0;
        while(true) {
            if(i == m) {
                while(j < n) {
                  tmp[index++] = nums2[j];
                  j++;
                }
                break;
            }
            if(j == n) {
                while(i < m) {
                    tmp[index++] = nums1[i];
                    i++;
                }
                break;
            }
            if(nums1[i] <= nums2[j]) {
                tmp[index++] = nums1[i];
                i++;
            } else {
                tmp[index++] = nums2[j];
                j++;
            }

        }
        for(i=0; i<m+n; i++) {
            nums1[i] = tmp[i];
        }
    }
}
