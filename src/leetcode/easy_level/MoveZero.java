package leetcode.easy_level;

import java.util.Arrays;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 29-12-2025
 */
public class MoveZero {

    public static void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[index] = nums[i];
                index++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            nums[j] = arr[j];
        }


    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}
