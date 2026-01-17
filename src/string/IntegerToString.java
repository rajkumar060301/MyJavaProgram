package string;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-01-2026
 */
public class IntegerToString {
    public static String integerToString(int num) {
        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);
        String str3 = String.format("%d", num);
        return str3;

    }

    public static void main(String[] args) {
        System.out.println(integerToString(123));
    }
}
