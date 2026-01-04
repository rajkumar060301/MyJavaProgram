package leetcode.easy_level;

import java.util.Arrays;
import java.util.List;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 28-12-2025
 */


//Example 1:
//
//Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]],
// ruleKey = "color", ruleValue = "silver"
//Output: 1
//Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
public class CountMatch {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("type")) index = 0;
        else if (ruleKey.equals("color")) index = 1;
        else if (ruleKey.equals("name")) index = 2;

        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey = "color", ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));

    }
}
