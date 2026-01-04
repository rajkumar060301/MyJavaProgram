package leetcode.easy_level;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 8 version
 * Date: 31-12-2025
 */
public class BestTimeBuySellStock {

    public static int maxProfit(int[] prices) {

        // Approch brute force
        // int maxProfit =0;
        // int buyerPrice =0;
        // int currentProfit =0;
        // for(int i =0;i<prices.length-1; i++){
        //     for(int j=i+1; j< prices.length; j++){
        //         buyerPrice = prices[i];
        //         currentProfit = prices[j] -  buyerPrice;
        //         if(maxProfit<currentProfit){
        //             maxProfit = currentProfit;
        //         }
        //     }

        // }

        // int minPrice = Integer.MAX_VALUE;
        // int maxProfit =0;
        // for(int price : prices){
        //     if(price < minPrice){
        //         minPrice = price;
        //     }
        //     else if(price - minPrice >maxProfit){
        //         maxProfit = price - minPrice;
        //     }
        // }

        int buyerPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyerPrice > prices[i]) {
                buyerPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - buyerPrice);

        }


        return maxProfit;

    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(arr));
    }
}
