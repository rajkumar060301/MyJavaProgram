package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 18-Jan-22
 */

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] number = new int[]{10, 45, 78, 65, 95};
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Total sum is " + sum);


    }
}
