package function.allMethod;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 24-Jan-22
 */


import java.util.Scanner;

public class WithoutArgumentsWithoutReturnType {
    public void withoutArgumentsWithoutReturnType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two number :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Without arguments and without return type");
        System.out.println("Total sum is " + sum);
    }

}

