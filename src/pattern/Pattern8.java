package pattern;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 26-Mar-23
 */public class Pattern8 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        int count = 2;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(count++ + " ");
                count = count + 1;

            }
            System.out.println();
        }
    }
}
