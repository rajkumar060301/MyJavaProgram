package string;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 22 version
 * Date: 22-05-2024
 */

public class PalindromePartisons {
    String str = "aab";

    public static void main(String[] args) {
        String str = "aaabbb";
        int size = str.length() - 1;
        System.out.println(size);
        for (int i = size; i >= 0; i--) {
            System.out.print("'" + str.charAt(i) + "' ");
            int update_size = size--;
            // System.out.println("update"+update_size);
            if (update_size >= 1) {
                if ((str.charAt(i) == str.charAt(i - 1))) {
                    System.out.print(str.charAt(i) + "" + str.charAt(i - 1) + " ");
                }
            }
        }


    }
}
