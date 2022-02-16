package conditionalProgram;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 17-Jan-22
 */

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year :");
        int year = scanner.nextInt();
        scanner.close();
        if (year % 4 == 0) {
            System.out.println("Leap year");

        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
