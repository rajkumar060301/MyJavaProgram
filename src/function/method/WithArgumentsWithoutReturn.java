package function.method;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 24-Jan-22
 */

// With arguments and without return type
public class WithArgumentsWithoutReturn {
    public static void main(String[] args) {
        WithArgumentsWithoutReturn withArgumentsWithoutReturn = new WithArgumentsWithoutReturn();
        int num1 = 23;
        int num2 = 20;
        withArgumentsWithoutReturn.sub(num1, num2);

    }

    void sub(int n1, int n2) {
        int sub = n1 - n2;
        System.out.println("Subtract is : " + sub);
    }
}
