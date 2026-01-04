package leetcode.easy_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 27-12-2025
 */
public class FindNumber {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            int len = str.length();
            if (len % 2 == 0) {
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {

        int[] arr = {555, 901, 482, 1771};
        System.out.println(findNumbers(arr));


    }
}
