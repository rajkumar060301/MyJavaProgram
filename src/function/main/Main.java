package function.main;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 24-Jan-22
 */

import function.allMethod.WithArgumentsWithReturnType;
import function.allMethod.WithArgumentsWithoutReturnType;
import function.allMethod.WithoutArgumentsWithReturnType;
import function.allMethod.WithoutArgumentsWithoutReturnType;

public class Main {
    public static void main(String[] args) {
        WithoutArgumentsWithoutReturnType withoutArgumentsWithoutReturnType = new WithoutArgumentsWithoutReturnType();
        withoutArgumentsWithoutReturnType.withoutArgumentsWithoutReturnType();
        WithoutArgumentsWithReturnType withoutArgumentsWithReturnType = new WithoutArgumentsWithReturnType();
        System.out.println("Without Arguments With Return Type");
        System.out.println(withoutArgumentsWithReturnType.withoutArgumentsWithReturnType());
        WithArgumentsWithoutReturnType withArgumentsWithoutReturnType = new WithArgumentsWithoutReturnType();
        withArgumentsWithoutReturnType.withArgumentsWithoutReturnType(85, 2);
        WithArgumentsWithReturnType withArgumentsWithReturnType = new WithArgumentsWithReturnType();
        withArgumentsWithReturnType.withArgumentsWithReturnType(98, 2);
        System.out.println("with Arguments With Return Type");
        System.out.println(withArgumentsWithReturnType.withArgumentsWithReturnType(98, 2));

    }
}
