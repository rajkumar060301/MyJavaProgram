package simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 16-Jan-22
 */
//Write a program in Java to input a purchase amount in ₹ from the user via Scanner class and and give 10% discount on the amount, and print the final
//amount to pay on the console.
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product rate:");
        int productPrice = scanner.nextInt();
        int discountInPercent = 10;
        float actualPrice = Math.abs((discountInPercent*productPrice/100)-productPrice);
        System.out.print("Actual Price is "+actualPrice);

    }
}
