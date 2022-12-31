package pattern;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 01-Dec-22
 */

public class HallowStar {
    public static void main(String[] args) {
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i == 0 || j == 0 || i == 5 || j == 5) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//                System.out.println();
//
//            }
//        }
        pattern2(5, 6);
    }

    static void pattern2(int n, int m) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                if (row == 1 || col == 1 || row == n || col == m) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

