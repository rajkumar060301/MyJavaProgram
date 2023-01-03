package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 03-Jan-23
 */

public class RemoveEvenElement {
    public static int[] removeEvenNum(int[] arr) {
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }

        }
        int[] result = new int[countOdd];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = {41, 78, 35, 96, 79};
        int[] result = removeEvenNum(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
