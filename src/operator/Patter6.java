package operator;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 26-Mar-23
 */public class Patter6 {
    public static void main(String[] args) {
        int row = 7;
        int col = 6;
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(count++ + " ");

            }
            System.out.println();

        }
    }
}
