package collectionFremwork.list_Interface;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 25-Apr-22
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(68);
        arrayList.add(35);
        arrayList.add(65);
        arrayList.add(28);
        arrayList.add(89);
        System.out.println("Array list is: " + arrayList);
        System.out.println("Using iterator");
        Iterator<Integer> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }


    }
}
