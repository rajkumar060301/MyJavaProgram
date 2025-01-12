package pattern;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 27-Mar-23
 */public class Pattern11 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= 3; j++) {

                System.out.print(i + " " + j + " ");
            }
            System.out.println();
        }
    }
}
