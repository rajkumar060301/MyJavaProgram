package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 03-Jan-23
 */

public class RemoveElement {
    public static int remove(int[] arr, int val) {
        int prevIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val)
                continue;
            arr[prevIndex++] = arr[i];
        }
        return prevIndex;

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3, 3};
        System.out.println(remove(arr, 3));

    }
}
