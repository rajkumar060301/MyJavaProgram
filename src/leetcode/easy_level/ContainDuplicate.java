package leetcode.easy_level;

import java.util.HashSet;
import java.util.Set;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 30-12-2025
 */
public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int num : nums) {
            set.add(num);
        }
        return len == set.size() ? false : true;

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(arr));
    }
}
