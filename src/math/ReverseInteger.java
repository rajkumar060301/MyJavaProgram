package math;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 01-Jan-23
 */

import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x) {
//        String str = Integer.toString(x);
//        StringBuffer sb = new StringBuffer(str);
//        String s = String.valueOf(sb.reverse());
//        int num = Integer.parseInt(s);
//        return num;
        int temp;
        long reverse = 0;

        while (x != 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;
        }
        if (reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE)
            return (int) reverse;
        else
            return 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));


    }
}
