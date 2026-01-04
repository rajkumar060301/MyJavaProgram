package leetcode.easy_level;

import java.util.Arrays;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 01-01-2026
 */
public class Anagram {

    public static boolean isAnagram(String s, String t) {
        String str1 = s.toLowerCase();
        String str2 = t.toLowerCase();
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if (charArr1.length == charArr2.length && Arrays.equals(charArr1, charArr2)) {
            return true;
        }
        return false;


    }

    public static void main(String[] args) {

        String str = "anagram";
        String str1 = "nagaram";
        System.out.println(isAnagram(str, str1));

    }
}
