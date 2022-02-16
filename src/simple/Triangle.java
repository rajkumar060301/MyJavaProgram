package simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-Jan-22
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side A:");
        int aSide = scanner.nextInt();
        System.out.print("Enter the side B:");
        int bSide = scanner.nextInt();
        System.out.print("Enter the side C:");
        int cSide = scanner.nextInt();
        scanner.close();
        float side = (aSide+bSide+cSide)/2;
        float area = (float) Math.sqrt(side*(side-aSide)*(side-bSide)*(side-cSide));
        System.out.println("Side is "+side);
        System.out.println("Area of triangle is "+area);
    }
}
