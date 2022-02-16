package function.method;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 24-Jan-22
 */

// With Arguments and with return type

public class WithArgumentsWithReturn {
    public static void main(String[] args) {
        int n1 = 85;
        int n2 = 5;
        WithArgumentsWithReturn withArgumentsWithReturn = new WithArgumentsWithReturn();
        System.out.println(withArgumentsWithReturn.divide(n1, n2));

    }

    public int divide(int num1, int num2) {
        int divide = num1 / num2;
        return divide;
    }
}

