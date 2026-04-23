//Problem Statement: You are the owner of a Shipment company. You use conveyor belts to ship packages from one port to another. The packages must be shipped within 'd' days. The weights of the packages are given in an array 'of weights'. The packages are loaded on the conveyor belts every day in the same order as they appear in the array. The loaded weights must not exceed the maximum weight capacity of the ship. Find out the least-weight capacity so that you can ship all the packages within 'd' days .00

import java.util.*;
public class shipPackage {
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while (left < right) {
            int mid = left + (right - left) / 2;
            int needed = daysNeeded(weights, mid);
            
            if (needed <= days) {
                // Agar kaam ho raha hai, toh aur chhoti capacity check karo
                right = mid; 
            } else {
                // Agar din zyada lag rahe hain, toh capacity badhao
                left = mid + 1;
            }
        }
        return left;
    }

    public int daysNeeded(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                // YAHAN Galti thi: Naya din shuru ho raha hai
                days++; 
                // Naya din is naye package (w) se start hoga
                currentLoad = w; 
            } else {
                // Aaj ke hi ship mein fit ho raha hai
                currentLoad += w;
            }
        }
        return days;
    }
    
    
    public static void main(String [] args){
         int[] weights = {5,4,5,2,3,4,5,6};
         int d = 5;
         shipPackage sol = new shipPackage();
         int res = sol.shipWithinDays(weights, d);
         System.out.println("Capacity to Ship Packages within D Days : " + res );
     }
}


// import java.util.*;
// public class shipPackage {
//     public int dayNeeded(int[] weights, int capacity){
//         int days = 1;
//         int currentLoad = 0;
//         for(int w: weights){
//             if(currentLoad + w > capacity){
//                 days++;
//                 currentLoad = w;
//             }
//             else{
//                 currentLoad += w;
//             }
//         }
//         return days;
//     }
//     public int shipWithinDay(int[] weights, int d){
//         int left = Arrays.stream(weights).max().getAsInt();
//         int right = Arrays.stream(weights).sum();

//         for(int capacity = left; capacity <= right; capacity++){
//             int needed = dayNeeded(weights, capacity);
//             if(needed <= d){
//                 return capacity;
//             }
//         }
//         return right;

//     }
//     public static void main(String [] args){
//         int[] weights = {5,4,5,2,3,4,5,6};
//         int d = 5;
//         shipPackage sol = new shipPackage();
//         int res = sol.shipWithinDay(weights, d);
//         System.out.println("The least capacity to ship the package with D days is as : " + res );
//     }
// }
