package dbcAssignment.main;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 16 version
 * Date: 26-Jan-22
 */

import dbcAssignment.multipleClasses.Pizza;

public class Main {
    public static void main(String[] args) {
        String[] ingredient = new String[]{"Onion", "Corn", "Cheese", "Capsciccum"};
        Pizza pizza = new Pizza();
        pizza.sizeInches = 10;
        System.out.println("This is Pizza Program");
        System.out.println("Name of Pizza :" + pizza.name);
        System.out.println("Total Price :" + pizza.calculatePrice(pizza.sizeInches, ingredient));


    }
}
