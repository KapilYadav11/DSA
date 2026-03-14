// Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


public class stockBuySell {
    public int stockBuyAndSell(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            }
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String [] args){
        stockBuySell sol = new stockBuySell();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maximumProfit = sol.stockBuyAndSell(prices);

        System.out.println("The maximum profit earned in stock buy & sell is equal to: " + maximumProfit);

    }
}






// THE GIVEN BELOW IS THE BRUTE FORCE APPROACH
// public class stockBuySell {
//     public int stockBuyAndSell(int[] prices){
//         int maxProfit = 0;
        
//         // iss loop m hum buy kr rahe hain
//         for(int i = 0; i < prices.length; i++){
        
//             // iss loop m hum sell kr rahe hai 
//             for(int j = i+1; j < prices.length; j++){

//                 int profit = prices[j] - prices[i];

//                 maxProfit = Math.max(maxProfit, profit);
//             }
//         }
//         return maxProfit;
//     }

//     public static void main(String [] args){
//         stockBuySell sol = new stockBuySell();
//         int[] prices = {7, 1, 5, 3, 6, 4};

//         int maxiProfit = sol.stockBuyAndSell(prices);

//         System.out.println("The max profit after selling the stock is :" + maxiProfit);
//     }
// }