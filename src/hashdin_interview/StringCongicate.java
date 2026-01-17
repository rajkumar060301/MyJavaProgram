package hashdin_interview;

import java.util.LinkedList;
import java.util.List;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-01-2026
 */
public class StringCongicate {

    public static List<String> congicateFun(String[] arr) {

        List<String> arrList = new LinkedList<>();
        if (arr.length == 0) return arrList;

        int count = 1;
        String str = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                count++;
            } else {
                arrList.add(str + "*" + count);
                str = arr[i];
                count = 1;
            }

        }
        arrList.add(str + "*" + count);


        return arrList;
    }


    public static void main(String[] args) {
        String[] arr = {"ERROR", "ERROR", "WARN", "INFO", "INFO", "INFO", "ERROR"};

        System.out.println(congicateFun(arr));

    }
}
