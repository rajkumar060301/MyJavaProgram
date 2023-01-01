package math;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 01-Jan-23
 */

import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
        String str = Integer.toString(x);
        StringBuffer sb = new StringBuffer(str);
        String s = String.valueOf(sb.reverse());
        int num = Integer.parseInt(s);
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));


    }
}
