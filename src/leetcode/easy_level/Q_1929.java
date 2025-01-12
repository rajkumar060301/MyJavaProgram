package leetcode.easy_level;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 29-Apr-23
 */

public class Q_1929 {
    public static int[] getConcatenation(int[] nums) {
        if (nums.length < 1)
            return nums;
        int ans[] = new int[2 * nums.length];
        for (int i = 0; i < 2 * nums.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i - nums.length];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        getConcatenation(arr);
        for (int i = 0; i < 2 * arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
