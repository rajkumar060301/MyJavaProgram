package leetcode.easy_level;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 19-01-2026
 */
public class FindMissingRepeatedValue {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length;
        int newSize = 0;
        for (int[] num : grid) {
            newSize = newSize + num.length;

        }
        int sum = newSize * (newSize + 1) / 2;
        int[] newArray = new int[newSize];
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                newArray[index++] = grid[i][j];

            }
        }
        Arrays.sort(newArray);
        int repeatedNumber = 0;

        for (int k = 0; k < newSize; k++) {
            if (newArray[k] == newArray[k + 1]) {
                repeatedNumber = newArray[k];
                break;
            }

        }
        Set<Integer> set = new HashSet<>();
        for (int num : newArray) {
            set.add(num);
        }

        int sum1 = set.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return new int[]{repeatedNumber, sum - sum1};

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 2}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(arr)));
    }
}
