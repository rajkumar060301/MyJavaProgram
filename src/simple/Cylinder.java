package simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-Jan-22
 */
// Write a program in Java to input the radius and height of a cylinder (via Scanner class), and calculate the volume of a cylinder.

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the radius:");
        float radius = scanner.nextInt();
        System.out.print("Enter the height:");
        float height = scanner.nextInt();
        scanner.close();
        float area =(float) Math.PI*radius*radius*height;
        System.out.println("Area of cylinder will be "+area);

    }
}
