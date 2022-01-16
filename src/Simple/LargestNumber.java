package Simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-Jan-22
 */

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the Second number :");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter the Third number :");
        int thirdNumber = scanner.nextInt();
        //Using ternary operator
        System.out.println("Using ternary operator");
        int result = (firstNumber>secondNumber )?firstNumber: secondNumber;
        int resultFirst = (thirdNumber>result)?thirdNumber:result;
        System.out.println(resultFirst +" is largest");
        //Using if else
        System.out.println("Using if else");
        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("Firs Number is greater");
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("Second number is greater");
        }
        else if (thirdNumber>firstNumber && thirdNumber>secondNumber){
            System.out.println("Third number is greater");
        }
        //Using math function find largest number
        System.out.println("Using math function");
        int max = Math.max(firstNumber,secondNumber);
        int maximum = Math.max(thirdNumber,max);
        System.out.println(maximum+" is max value");


    }
}
