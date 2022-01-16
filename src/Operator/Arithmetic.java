package Operator;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-Jan-22
 */

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the Second Number:");
        int secondNumber = scanner.nextInt();
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication= firstNumber * secondNumber;
        float divide = firstNumber / secondNumber;
        int modules = firstNumber % secondNumber;
        System.out.println("Addition:"+addition);
        System.out.println("Subtraction:"+subtraction);
        System.out.println("Multiply:"+multiplication);
        System.out.println("Divide:"+divide);
        System.out.println("Modules:"+modules);

    }
}
