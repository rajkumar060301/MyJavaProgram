package leetcode.easy_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 30-12-2025
 */
public class MaximumCongicate {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
