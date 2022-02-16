package function.method;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 24-Jan-22
 */

// Without arguments and with return type

public class WithoutArgumentsWithReturn {
    public static void main(String[] args) {
        WithoutArgumentsWithReturn withoutArgumentsWithReturn = new WithoutArgumentsWithReturn();
        System.out.println(withoutArgumentsWithReturn.mul());

    }

    int mul() {
        int num1 = 98;
        int num2 = 58;
        int mul = num1 * num2;
        return mul;
    }
}
