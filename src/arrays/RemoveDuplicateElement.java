package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 02-Jan-23
 */

public class RemoveDuplicateElement {
    public static int removeDuplicates(int[] nums) {
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[result - 1]) {
                nums[result] = nums[i];
                result++;
                return result;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr));

    }
}
