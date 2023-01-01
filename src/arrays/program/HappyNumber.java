package arrays.program;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 01-Jan-23
 */

public class HappyNumber {
    public static void main(String[] args) {
        int num = 82;
        int n = num;
        int rem;
        int sum = 0;
        while (n > 9) {
            while (n > 0) {
                rem = n % 10;
                sum = sum + (int) Math.pow(rem, 2);
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1) {
            System.out.println("Happy Number is " + num);
        } else {
            System.out.println("Not Happy number is " + num);
        }

    }
}
