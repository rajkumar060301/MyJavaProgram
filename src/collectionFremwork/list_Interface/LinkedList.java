package collectionFremwork.list_Interface;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 25-Apr-22
 */

import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>();
        linkedList.add(65);
        linkedList.add(98);
        linkedList.add(12);
        linkedList.add(36);
        linkedList.add(98);
        linkedList.add(93);
        linkedList.add(92);
        linkedList.push(68);
        linkedList.set(5, 20);
        System.out.println("LinkedList:" + linkedList);
        System.out.println("Using iterator");
        Iterator<Integer> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }
    }
}
