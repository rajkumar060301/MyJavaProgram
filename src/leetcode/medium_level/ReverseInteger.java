package leetcode.medium_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 16-01-2026
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long sum = 0;
        while (x != 0) {
            long remain = x % 10;
            sum = (sum * 10) + remain;
            x = x / 10;
        }
        if (sum > max || sum < min) return 0;
        return (int) sum;

    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverse(num));

    }
}
