package arrays.program;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 02-Jan-23
 */

import java.util.Scanner;

public class FindMinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        //Loop through the array
        for (int i = 0; i < arr.length; i++) {
            //Compare elements of array with min
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);

    }
}
