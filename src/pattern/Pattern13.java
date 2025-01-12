package pattern;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 27-Mar-23
 */public class Pattern13 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        int a, b;
        for (int i = 1; i <= 5; i++) {
            a = i;
            b = col - i + 1;
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 1) {
                    System.out.print(a + " ");
                } else {
                    System.out.print(b + " ");
                }
                a = a + col;
                b = b + col;
            }

            System.out.println();
        }


    }
}
