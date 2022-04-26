package list;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 25-Apr-22
 */

import java.util.Stack;

public class StackClassExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ram");
        stack.push("Anjali");
        stack.push("Jyoti");
        stack.push("Gagan");
        stack.push("Manish");
        stack.push("Shashank");
        stack.push("Kajal");
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.capacity());
        System.out.println(stack.pop());
        System.out.println(stack.search("Ram"));

    }
}
