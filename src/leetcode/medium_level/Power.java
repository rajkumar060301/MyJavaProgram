package leetcode.medium_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 22-01-2026
 */
public class Power {
    public static double myPow(double x, int n) {

        if (n < 0) {
            return 1.0 / power(x, -n);
        }
        return power(x, n);

    }

    private static double power(double x, int n) {
        if (n == 0) return 1.0;
        if (n == 1) return x;

        if (n % 2 == 0) {
            return power(x * x, n / 2);
        }
        return x * power(x, n - 1);

    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));

    }
}
