package pattern;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 26-Mar-23
 */public class Pattern9 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
