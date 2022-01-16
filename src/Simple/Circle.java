package Simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 15-Jan-22
 */

import java.util.Scanner;

public class Circle {
    // find the area AND circumference of circle
    public static void main(String[] args) {
        System.out.print("Enter the radius :");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        float area = (float) (radius*radius*Math.PI);
        System.out.println("Area of circle :"+area);
        float circumference = (float) (2*Math.PI*radius);
        System.out.println("Circumference of circle:"+circumference);


    }
}
