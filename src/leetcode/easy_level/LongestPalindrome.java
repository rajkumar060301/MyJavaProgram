package leetcode.easy_level;

import java.util.HashMap;
import java.util.Map;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 28-01-2026
 */
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        int length = s.length();
        if (length == 1) return 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean flag = false;
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                count = count + entry.getValue();
            } else {
                count = entry.getValue() - 1;
                flag = true;
            }
        }
        if (!flag) return count;
        return count + 1;
    }

    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(longestPalindrome(str));

    }
}
