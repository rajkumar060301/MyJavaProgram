package leetcode.easy_level;

import java.util.*;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 23-01-2026
 */
public class MajorityElementII {

    public static List<Integer> majorityElement(int[] nums) {
        int len = (nums.length) / 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > len) {
                set.add(nums[i]);
            }

        }
        List<Integer> list = new ArrayList<>(set);

        return list;

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(majorityElement(arr));
    }
}
