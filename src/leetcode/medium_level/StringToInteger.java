package leetcode.medium_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 15-01-2026
 */
public class StringToInteger {
    public static int myAtoi(String s) {
        if (s.trim() != "") {
            s = s.replace('_', ' ');
            s = s.replace('-', ' ');
            s = s.replace('+', ' ');
            s = s.replace('*', ' ');
            s = s.replace('/', ' ');
            s = s.replace('%', ' ');
        }
        int num = Integer.valueOf(s.trim());
        return num;
    }

    public static void main(String[] args) {
        String str = "-042";
        System.out.println(myAtoi(str));
    }
}
