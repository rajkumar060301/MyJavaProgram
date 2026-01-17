package leetcode.easy_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 08-01-2026
 */
public class SumTwoBinaryString {
    public static String addBinary(String a, String b) {
        int carry = 0;
        int i = 0;
        int num1 = 0;
        int num2 = 0;
        int length = a.length();
        while (a.length() > i) {
            num1 = (int) (Math.pow(2, i) + (int) a.charAt(length));
            length--;

        }
        System.out.println(num1);


        return "testing";

    }

    public static void main(String[] args) {
        String str1 = "1010";
        String str2 = "1011";
        System.out.println(addBinary(str1, str2));

    }
}
