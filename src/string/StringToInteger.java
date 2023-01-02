package string;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 01-Jan-23
 */

public class StringToInteger {
    public static int stringToInteger(String s) {
        int num = Integer.valueOf(s);
        return num;

    }

    public static void main(String[] args) {
        String s = "-75";
        System.out.println(stringToInteger(s));


    }
}
