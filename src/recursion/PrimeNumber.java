package recursion;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 01-Sep-22
 */

public class PrimeNumber {
    public static void printPrime(int n) {
        int count;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        printPrime(98);
    }
}
