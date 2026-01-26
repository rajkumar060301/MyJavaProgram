package leetcode.medium_level;

import java.util.HashSet;
import java.util.Set;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 25-01-2026
 */
public class ConsecutiveCount {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int number : set) {
            if (!set.contains(number - 1)) {
                int currentNumber = number;
                int currentStreak = 1;

                while (set.contains(currentNumber + 1)) {
                    currentNumber++;
                    currentStreak++;
                }
                count = Math.max(count, currentStreak);

            }

        }
        return count;


    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive(arr));

    }
}
