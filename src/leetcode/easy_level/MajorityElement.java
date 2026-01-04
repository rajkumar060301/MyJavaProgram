package leetcode.easy_level;

import java.util.HashMap;
import java.util.Map;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 03-01-2026
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int len = nums.length;
        int mid = len / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > mid) {
                return nums[i];

            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));


    }
}
