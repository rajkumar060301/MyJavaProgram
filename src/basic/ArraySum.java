package basic;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 17-01-2026
 */
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger bigInteger = sc.nextBigInteger();
        BigInteger[] big = new BigInteger[n];
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            big[i] = sc.nextBigInteger();
            sum = sum.add(big[i]);
        }
        System.out.println(sum);
    }
}
