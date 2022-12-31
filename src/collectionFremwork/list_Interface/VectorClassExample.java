package collectionFremwork.list_Interface;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 25-Apr-22
 */

import java.util.Iterator;
import java.util.Vector;

public class VectorClassExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Vector<Long> long1 = new Vector<>();
        long1.add(7480958979l);
//        System.out.println(long1.add(7480958979l));
        System.out.println(long1);
        vector.add(65);
        vector.add(85);
        vector.add(23);
        vector.add(89);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);
        vector.add(02);

        System.out.println("vector: " + vector);
        System.out.println(vector.capacity());
        System.out.println("Using iterator");
        Iterator<Integer> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }

    }
}
