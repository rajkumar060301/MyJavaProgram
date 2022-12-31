package arrays;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 17-Jan-22
 */

//Write a program in Java to store 10,000 marks of students and then count the number of students who received marks from 30-40, 40-50, 50-60, 60-70, 70-80, 80-90, 90-100
// using arrays.
public class CountMarks {
    public static void main(String[] args) {
        //  Without input type create array
        int sum = 0;
        System.out.println("Without input type create array");
        int[] marks = {35, 45, 55, 65, 75, 85, 95};
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        System.out.println("Total sum is " + sum);
    }
}
