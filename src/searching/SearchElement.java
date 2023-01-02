package searching;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 02-Jan-23
 */

public class SearchElement {
    public static int findPosition(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target || nums[i] > target)
                return i;

        return nums.length;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6};
        int target = 5;
        System.out.println(findPosition(arr, target));

    }
}