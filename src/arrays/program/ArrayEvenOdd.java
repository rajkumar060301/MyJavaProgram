package arrays.program;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 18-Jan-22
 */
//Write a program an array and print even, odd  number
public class ArrayEvenOdd {
    public static void main(String[] args) {
        int store;
        int[] number = new int[]{10, 45, 86, 95, 35};
        for (int i = 0; i < number.length; i++) {
            store = number[i];
            //System.out.print(store+" ");
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + " ");

            }


        }
    }
}
