package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test13 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        Test13 t13 = new Test13();
        int[] res = t13.intersection02(nums1, nums2);
        Arrays.stream(res).forEach(x -> System.out.println(x + "  "));
    }

    /**
     * 两个数组的交集
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        if(nums1 == null || nums2 == null) {
            return new int[]{};
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i=0;
        int j=0;
        while(i<len1 && j<len2) {
            if(nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] res = new int[set.size()];
        int index = 0;
        for(Integer tmp : set) {
            res[index++] = tmp;
        }
        return res;
    }

    /**
     * 350. 两个数组的交集 II
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection02(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) {
            return new int[]{};
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0;
        int j = 0;
        int[] tmp = new int[Math.min(len1, len2)];
        int x = 0;
        while(i<len1 && j<len2) {
            if(nums1[i] == nums2[j]) {
                tmp[x++] = nums1[i];
                i++;
                j++;
            } else if(nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] res = new int[x];
        for(int index=0; index<res.length; index++) {
            res[index] = tmp[index];
        }
        return res;
    }
}
