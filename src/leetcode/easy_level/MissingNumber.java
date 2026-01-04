package leetcode.easy_level;

import java.util.Arrays;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 29-12-2025
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int sum = len * (len + 1) / 2;
        int count = 0;
        for (int num : nums) {
            count = count + num;
        }

        return sum - count;

    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));

    }
}
