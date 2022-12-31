package recursion;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 26-Apr-22
 */

import java.util.Scanner;

public class Factorial {
    // Find factorial using recursion
    public static int fact(int n) {
        int fact = 1;
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }


    }

    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
//        System.out.println(number);
        // Using loop
        int fact = 1;
        for (int i = number; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("Using loop");
        System.out.println("Factorial is " + fact);

        // Using recursion
        System.out.println("Using recursion");
        System.out.println("Factorial is: " + fact(number));

    }
}
