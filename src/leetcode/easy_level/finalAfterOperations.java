package leetcode.easy_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 28-12-2025
 */
public class finalAfterOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X")) {
                --x;
            } else if (operations[i].equals("X--")) {
                x--;
            } else if (operations[i].equals("++X")) {
                ++x;
            } else if (operations[i].equals("X++")) {
                x++;
            }
        }
        return x;


    }

    public static void main(String[] args) {

        String[] strArray = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(strArray));

    }
}
