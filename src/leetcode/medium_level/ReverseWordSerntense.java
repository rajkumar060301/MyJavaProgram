package leetcode.medium_level;

import java.util.ArrayList;
import java.util.List;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 27-01-2026
 */
public class ReverseWordSerntense {

    public static String reverseWords(String s) {
        List<String> list = new ArrayList<>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                str = str + s.charAt(i);
            } else {
                if (str != "") {
                    list.add(str);
                }
                str = "";
            }


        }
        list.add(str);
        String str1 = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            str1 = str1 + list.get(i) + " ";


        }
        return str1.trim();

    }

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));

    }
}
