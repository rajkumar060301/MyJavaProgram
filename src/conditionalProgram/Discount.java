package conditionalProgram;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 16-Jan-22
 */
/*
Re-write the above program and apply discount on the basis of the total purchase amount
if purchase amount > 1000, discount 10%
if purchase amount > 5000, discount 20%
if purchase amount > 10000, discount 30%
 */

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price:");
        int productOfPrice = scanner.nextInt();
        scanner.close();
        if (productOfPrice>1000){
            int discountPercent = 10;
            float discount = (productOfPrice*discountPercent)/100;
            System.out.print("Pay price is "+ (productOfPrice-discount));
        }
        else if (productOfPrice>5000){
            int discountPercent = 20;
            float discount = (productOfPrice*discountPercent)/100;
            System.out.print("Pay price is "+ (productOfPrice-discount));
        }
        else if (productOfPrice>10000){
            int discountPercent = 30;
            float discount = (productOfPrice*discountPercent)/100;
            System.out.print("Pay price is "+ (productOfPrice-discount));
        }
        else {
            System.out.println("Pay price! for you have no discount "+productOfPrice);
        }
    }
}
