package leetcode.easy_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 27-12-2025
 */
public class MaximumRichest {

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum >= max) {
                max = sum;
            }
            sum = 0;
        }

        return max;

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }
}
