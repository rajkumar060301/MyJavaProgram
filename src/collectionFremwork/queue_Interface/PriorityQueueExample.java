package collectionFremwork.queue_Interface;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 26-Apr-22
 */

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("Raj");
        priorityQueue.add("Gagan");
        priorityQueue.add("Resham");
        priorityQueue.add("Karishma");
        priorityQueue.add("Jeetu");
        priorityQueue.add("Vikram");

        System.out.println(priorityQueue);
        System.out.println("head: " + priorityQueue.element());
        System.out.println("peak: " + priorityQueue.peek());
        System.out.println("remove: " + priorityQueue.remove());
        Iterator<String> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
