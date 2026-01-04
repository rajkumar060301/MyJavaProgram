package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 02-Jan-23
 */

import java.util.Arrays;

public class RemoveDuplicateElement {
    public static int[] removeDuplicates(int[] nums) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for(int data : nums){
//            hashSet.add(data);
//        }
//        return hashSet.toArray();
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[i] != nums[j]) {
                    arr[i] = nums[i];
                }
            }
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(removeDuplicates(arr)));

    }
}
