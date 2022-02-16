package home;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 24-Jan-22
 */

public class CreateRandomNumber {

    public static void main(String[] args) {
        double sum = 0;
        //Random random = new Random();
        for (int i = 0; i < 15; i++) {
            sum = sum + Math.random();
        }
        System.out.println(sum);

    }
}
