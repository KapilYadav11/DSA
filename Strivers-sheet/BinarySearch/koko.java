// Koko Eating Bananas Problem;
import java.util.*;

// Binary Search approach
public class koko {
    public int calculateTotalHr(int[] pile, int speed){
        int totalH = 0;
        for (int banana : pile) {
            totalH += (int)Math.ceil((double)banana / speed);
        }
        return totalH;
    }

    public int minEatSpeed(int[] piles, int h){
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int low = 1, high = maxPile;
        int ans = maxPile;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHr(piles, mid);

            if(totalH <= h){
                ans = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String [] args){
        int[] piles = {3,6,7,11};
        int h = 8;
        koko sol = new koko();
        int res = sol.minEatSpeed(piles, h);
        System.out.println("wo \"minimum\" point dhunda hai jahan se \"Possible\" shuru hota hai : " + res);
    }
}



// Brute force approach
// public class koko {
//     public int calculateTotalHours(int[] arr, int h){
//         int totalHours = 0;
//         for (int pile : arr) {
//             totalHours += (int)Math.ceil((double)pile / h);
//         }
//         return totalHours;
//     }

//     public int minEatingSpeed(int[] arr, int h){
//         int maxVAl = Arrays.stream(arr).max().getAsInt();
//         for(int i = 1; i <= maxVAl; i++){
//             int hours = calculateTotalHours(arr, i);

//             if(hours <= h){
//                 return i;
//             }
//         }
//         return maxVAl;
//     }
//     public static void main(String [] args){
//         int[] arr = {3,6,7,11};
//         int h = 8;
//         koko sol = new koko();
//         int ans = sol.minEatingSpeed(arr, h);
//         System.out.println("MInimum no of banana to eat per hr " + ans);
        
//     }
// }
