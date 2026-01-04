package leetcode.easy_level;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 31-12-2025
 */
public class TwoSumsQuestions {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(remain)) {
                return new int[]{map.get(remain), i};
            }
            map.put(nums[i], i);

        }

        return new int[]{};

    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
