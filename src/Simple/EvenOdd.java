package Simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-Jan-22
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println(number+" is Even Number");
        }
        else{
            System.out.println(number+" is Odd Number");
        }
    }
}
