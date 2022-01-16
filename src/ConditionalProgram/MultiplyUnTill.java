package ConditionalProgram;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 16-Jan-22
 */

import java.util.Scanner;

public class MultiplyUnTill {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = scanner.nextInt();
        scanner.close();
        for (int Index = 1; Index <=number ; Index++) {
            System.out.println("2 "+"X "+Index+" "+2*Index);
        }
    }
}
