// LEETCODE 904;;;;
import java.util.*;
public class FruitBasket {
    public int totalFriuts(int[] fruits){
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruit = 0;

        for(int right = 0; right < fruits.length; right++){
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while(basket.size() > 2){
                basket.put(fruits[left], basket.get(fruits[left]) - 1);

                if(basket.get(fruits[left]) == 0){
                    basket.remove(fruits[left]);
                }
                left++;
            }
             maxFruit = Math.max(maxFruit, right - left + 1);
        }
         return maxFruit;
    }

    public static void main(String[] args) {
        FruitBasket sol = new FruitBasket();
        int[] fruits = {1, 2, 1};
        System.out.println(sol.totalFriuts(fruits)); // Output: 3
     }
}

//BRUTE FORCE APPROACH
// import java.util.HashMap;
// import java.util.Map;

// public class FruitBasket {
//     public int totalFriuts(int[] fruits){
//         int maxFruit = 0;
//         for(int start = 0; start < fruits.length; start++){
//             Map<Integer, Integer> basket = new HashMap<>();
//             int currentCount = 0;
//             for(int end = start; end < fruits.length; end++){
//                 basket.put(fruits[end], basket.getOrDefault(fruits[end] ,0) + 1 );

//                 if(basket.size() > 2){
//                     break;
//                 }

//                 currentCount++;
//             }
//             maxFruit = Math.max(maxFruit, currentCount);
//         }
//         return maxFruit;
//     }

//     public static void main(String[] args) {
//         FruitBasket sol = new FruitBasket();
//         int[] fruits = {1, 2, 1};
//         System.out.println(sol.totalFriuts(fruits)); // Output: 3
//     }
// }
