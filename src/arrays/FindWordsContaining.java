package arrays;
/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 27-Feb-24
 */

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        char charValue = 'a';
        String[] arr = {"abc", "bcd", "aaaa", "cbc"};
        for (int i = 0; i < arr.length; i++) {

            char[] charArray = new char[arr[i].length()];
            for (int j = 0; j < arr[i].length(); j++) {
                //System.out.print(arr[i].charAt(j)+" ");
                if (arr[i].charAt(j) == charValue) {
                    list.add(i);
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
