package leetcode.medium_level;

import java.util.HashMap;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 31-12-2025
 */
public class SubArraySumEqual {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            // Step I: // Update the prefix sum
            sum += num;

            // Step II: Check if (sum - k) exists in the map
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Step III: Add the current sum to the map (increment the frequency)
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;

    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int k = 2;
        System.out.println(subarraySum(arr, k));

    }
}
