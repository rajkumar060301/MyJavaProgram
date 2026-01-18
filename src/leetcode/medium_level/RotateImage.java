package leetcode.medium_level;

import java.util.Arrays;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 18-01-2026
 */
public class RotateImage {
    public static void rotate(int[][] a) {
        int n = a.length;
        transpose(a, n);
        reverse(a, n);
    }

    public static void transpose(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    public static void reverse(int a[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        rotate(arr);
        int count = 0;
        for (int[] arrray : arr) {
            System.out.println(Arrays.toString(arr[count]));
            count++;

        }
    }
}
