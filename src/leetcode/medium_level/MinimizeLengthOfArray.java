package leetcode.medium_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 06-01-2026
 */
public class MinimizeLengthOfArray {

    public static int minimumArrayLength(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i : nums) {
            if (i < min) {
                min = i;
                count = 1;
            } else if (i == min) {
                count++;
            }
        }
        for (int i : nums) {
            if (i % min != 0) {
                return 1;
            }
        }
        int rs = count / 2 + count % 2;
        return rs;


    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 1};
        System.out.println(minimumArrayLength(arr));


    }
}
