package recursion.mathmatics;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 12-May-22
 */

import java.util.Scanner;

public class Algebra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Algebra algebra = new Algebra();
        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

        System.out.println(algebra.formula(a, b));
        System.out.println("Enter the number for find factorial: ");
        int number = scanner.nextInt();
        System.out.println(algebra.fact(number));


    }

    public int fact(int n) {
        int fact1 = 1;
        if (n >= 1) {
            fact1 = fact(n - 1) * n;
        }
        return fact1;

    }

    public int formula(int a, int b) {
        int c = a * a + 2 * a * b + b * b;
        return c;

    }
}
