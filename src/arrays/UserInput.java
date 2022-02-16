package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 17-Jan-22
 */

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int length = scanner.nextInt();
        int[] rollNumber = new int[length];
        for (int counter = 0; counter < length; counter++) {
            System.out.println("Enter roll number: " + (counter + 1));
            rollNumber[counter] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Your roll Number of array is");
        for (int j = 0; j < length; j++) {
            System.out.print(rollNumber[j] + " ");

        }

    }
}
