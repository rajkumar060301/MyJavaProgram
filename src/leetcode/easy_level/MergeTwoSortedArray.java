package leetcode.easy_level;

import java.util.Arrays;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 20-01-2026
 */
public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalSize = m + n;
        int index = 0;
        int[] arr = new int[totalSize];
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));


    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(arr1, m, arr2, n);


    }
}
