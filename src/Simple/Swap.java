package Simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-Jan-22
 */

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number:");
        int secondNumber = scanner.nextInt();
        int temp;
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("After swiping take with  temp variable"+"\n"+"First number: "+firstNumber+"\n"+"Second Number: "+secondNumber);
        System.out.println("After swiping take without  temp variable");
        firstNumber = firstNumber + secondNumber;
        secondNumber = Math.abs(firstNumber - secondNumber);
        firstNumber = Math.abs(secondNumber - firstNumber);
        System.out.println("First number: " + firstNumber + "\n" + "Second Number: " + secondNumber);

    }
}
