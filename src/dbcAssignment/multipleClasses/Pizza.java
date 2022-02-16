package dbcAssignment.multipleClasses;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 17 version
 * Date: 26-Jan-22
 */

public class Pizza {

    final double PRICE_OF_ONE_INGREDIENT_IN_RUPEES = 10.0;
    final double PRICE_FOR_SMALL_PIZZA_IN_RUPEES = 350.0;
    final double PRICE_FOR_MEDIUM_PIZZA_IN_RUPEES = 500.0;
    final double PRICE_FOR_LARGE_PIZZA_IN_RUPEES = 650.0;
    public double priceRupees;
    public int sizeInches;
    public String[] ingredients;
    public String name = "Domino's";

    public double calculatePrice(int sizeInches, String[] ingredients) {
        return (ingredients.length * PRICE_OF_ONE_INGREDIENT_IN_RUPEES + calculateSizeBasisPrice(sizeInches));
    }

    private double calculateSizeBasisPrice(int sizeInches) {
        return switch (sizeInches) {
            case 10 -> PRICE_FOR_MEDIUM_PIZZA_IN_RUPEES;
            case 12 -> PRICE_FOR_LARGE_PIZZA_IN_RUPEES;
            default -> PRICE_FOR_SMALL_PIZZA_IN_RUPEES;
        };
    }


}
