package simple;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 16-Jan-22
 */

import java.util.Scanner;
//  Sum=1+2+3+...+n

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int sum = 0;
        for (int Index = 1; Index <= number; Index++) {
            sum = sum + Index;
            System.out.println("Total sum is " + sum);

        }
    }
}
// while
//class sum {
//    public static void main(String args[]){
//        int n = 5;  //just taking n=5
//        int sum = 0;
//        int i=1;
//        while(i<=n){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("Sum is "+sum);
//    }
//}
// do while
//class ADD {
//    public static void main(String args[]){
//        int n = 5;  //just taking n=5
//        int sum = 0;
//        int i=1;
//        do{
//            sum = sum + i;
//            i++;
//        }
//        while(i<=n);
//        System.out.println("Sum is "+sum);
//    }
//}


//    Sum=a+2a+3a+...+na (input a also)

class SumA {
    public static void main(String[] args) {
        int sum = 0;
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter the A :");
        int aNumber = newScanner.nextInt();
        newScanner.close();
        for (int i = 1; i <= aNumber; i++) {
            sum = sum + i;
            System.out.print(sum);
        }
    }
}