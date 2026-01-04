package searching;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 04-05-2025
 */
public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int start = 1;
        int end = arr.length;


        while (start <= end) {
            int mid = (start + end) / 2;
            mid = (int) Math.floor(mid);
            if (arr[mid] == target) {

                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 9, 10};
        int target = 5;

        int result = binarySearch(arr, target);
        System.out.println(result);
        if (result == -1)
            System.out.println("Element not found");

        else
            System.out.println("Element found at index " + result);

    }
}
