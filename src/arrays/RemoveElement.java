package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 03-Jan-23
 */

public class RemoveElement {
    public static int remove(int[] arr, int val) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == val)
                break;
            else
                count++;

        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        System.out.println(remove(arr, 3));

    }
}
