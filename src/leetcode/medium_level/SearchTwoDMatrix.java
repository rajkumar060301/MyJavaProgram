package leetcode.medium_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 22-01-2026
 */
public class SearchTwoDMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr : matrix) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) return true;

            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(arr, 3));

    }
}
