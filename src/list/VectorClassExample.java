package list;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 25-Apr-22
 */

import java.util.Vector;

public class VectorClassExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(65);
        vector.add(65);

        System.out.println("vector: " + vector);
        System.out.println(vector.capacity());

    }
}
