package leetcode.medium_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 03-02-2026
 */
public class SingleElementInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums){
//            map.put(num , map.getOrDefault(num, 0) + 1);
//        }
//        for(int number : nums){
//            if(map.get(number)==1){
//                return number;
//            }
//        }
//
//        return 0;
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(arr));

    }
}
