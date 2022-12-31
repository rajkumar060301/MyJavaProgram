package simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 20-Nov-22
 */

public class Lcm {
    public static void main(String[] args) {
        int a = 8;
        int b = 10;
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++)
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        int lcm = (a * b) / gcd;
        System.out.println(lcm);
    }
}
