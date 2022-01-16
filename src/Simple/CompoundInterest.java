package Simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 16-Jan-22
 */

/*
Write a program in Java to input the principal amount, rate of interest and time duration in years for a loan. Calculate the Compound Interest on the
 loan compounded annually, and store it in a separate variable. Print the Compounded Interest for the next 10 years. Select the appropriate data type
 for each input.
 */
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float principle = scanner.nextFloat();
        System.out.print("Enter the the rate :");
        float rate = scanner.nextFloat();
        System.out.print("Enter the time:");
        float time = scanner.nextFloat();
        scanner.close();
        int n=10;
        double compoundInterest = (double) (principle *Math.pow(1+(rate/n),n*time));
        System.out.print("Total Compound interest is : "+compoundInterest);

    }
}
