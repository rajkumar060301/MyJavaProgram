package arrays.program;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 24-Jan-22
 */

import java.util.Random;

public class CreateArrayRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
            System.out.print(Math.abs(number[i]) + " ");

        }
    }
}
