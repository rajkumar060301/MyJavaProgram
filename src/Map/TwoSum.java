package Map;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 13-01-2026
 */
class TwoSumProblems {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int remains = target - arr[i];
            if (map.containsKey(remains)) {
                return new int[]{map.get(remains), i};
            }
            map.put(arr[i], i);

        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
