package function.method;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 24-Jan-22
 */
/*
    1 . Function without arguments and without return value
    2 . Function without arguments and  with return type
    3 . Function with arguments and without return type
    4 . Function with arguments and with return type
 */

// Without arguments and without return type

public class WithoutArgumentsWithoutReturn {
    public static void main(String[] args) {
        WithoutArgumentsWithoutReturn withoutArgumentsWithoutParameter = new WithoutArgumentsWithoutReturn();
        withoutArgumentsWithoutParameter.sum();
    }

    void sum() {
        int num1 = 45;
        int num2 = 86;
        int sum = num1 + num2;
        System.out.println("Total sum is : " + sum);
    }
}
