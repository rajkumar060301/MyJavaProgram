package pattern;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 27-Mar-23
 */public class Pattern12 {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        int count;
        for (int i = 1; i <= 5; i++) {
            count = i;
            for (int j = 1; j <= 5; j++) {
                System.out.print(count + " ");
                count = count + 5;
            }
            System.out.println();
        }
    }
}
