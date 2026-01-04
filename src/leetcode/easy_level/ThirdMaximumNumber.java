package leetcode.easy_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 29-12-2025
 */
public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        ArrayList<Integer> list = new ArrayList<>(hashSet);
        int size = hashSet.size();
        for (int j = size; j > 0; j--) {
            if (j == size - 1) {
                return list.get(j);
            }

        }

        return 0;


    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1};
        System.out.println(thirdMax(arr));

    }
}
