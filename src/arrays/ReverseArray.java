package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 03-Jan-23
 */

public class ReverseArray {
    public static void reversElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {45, 33, 66, 21, 87};
        printArray(arr);
        reversElement(arr);
        printArray(arr);


    }
}
