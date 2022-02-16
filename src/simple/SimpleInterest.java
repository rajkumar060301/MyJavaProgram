package simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-Jan-22
 */

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        float principle = scanner.nextFloat();
        System.out.print("Enter the rate :");
        float rate = scanner.nextFloat();
        System.out.print("Enter the time :");
        float time = scanner.nextFloat();
        scanner.close();
        float interest = (principle*rate*time)/100;
        System.out.print("Simple interest is "+interest);
    }
}
