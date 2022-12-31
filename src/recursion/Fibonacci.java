package recursion;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 26-Apr-22
 */

import java.util.Scanner;

public class Fibonacci {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);

            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        int number;
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        System.out.println("Without recursion");
        int sum;
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < number; i++) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;

        }
        System.out.println();
        System.out.println("With recursion");
//        System.out.println(printFibonacci(number));
        System.out.print(0 + " " + 1);//printing 0 and 1
        printFibonacci(number - 2);


    }
}
