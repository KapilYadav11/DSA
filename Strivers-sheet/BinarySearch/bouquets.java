// Problem Statement: You are given 'N’ roses and you are also given an array 'arr' where 'arr[i]' denotes that the 'ith' rose will bloom on the 'arr[i]th' day. You can only pick already bloomed roses that are adjacent to make a bouquet. You are also told that you require exactly 'k' adjacent bloomed roses to make a single bouquet. Find the minimum number of days required to make at least ‘m' bouquets each containing 'k' roses. Return -1 if it is not possible.

import java.util.*;
public class bouquets {
    public boolean isPossible(int[] bloomDays, int day, int k, int m){
        int count = 0;
        int bouquet = 0;
        for(int bloom: bloomDays){
            if(bloom <= day){
                count++;
                if(count == k){
                    bouquet++;
                    count = 0;
                }
            } else{
                count = 0;
            }
        }
        return bouquet >= m;
    }

    public int minDaysToMakeBouquets(int[] bloomDays, int k, int m){
        long required = (long) m * k;
        if(required > bloomDays.length){
            return -1;
        }
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        for(int bloom: bloomDays){
            minDay = Math.min(minDay, bloom);
            maxDay = Math.max(maxDay, bloom);
        }
            int low = minDay, high = maxDay, result = -1;

            while (low <= high) {
                int mid = (low + high) / 2;
                if(isPossible(bloomDays, mid, m, k)){
                    result = mid;
                    high = mid - 1;
                } else{
                    low = mid + 1;
                }
            }
        return result;
    }

    public static void main(String [] args){
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;
        bouquets garden = new bouquets();
        int result = garden.minDaysToMakeBouquets(bloomDays, k, m);
        if(result == -1){
            System.out.println("We cannot make the bouquest");
        } else{
            System.out.println("We can make the bouquets: " + result);
        }

    }
}


//Brute force approach
// import java.util.*;
// public class bouquets {
//     public boolean isPossible(int[] bloomDays, int day, int m, int k){
//         int count = 0;
//         int bouquet = 0;
//         for(int bloom: bloomDays){
//             if(bloom <= day){
//                 count++;
//                 if(count == k){
//                     bouquet++;
//                     count = 0;
//                 }
//             } else{
//                 count = 0;
//             }
//         }
//         return bouquet >= m;
//     }
//     public int minDaysToMakeBouquets(int[] bloomDays, int m, int k){
//         long totalFlowers = (long) m * k;
//         if(totalFlowers > bloomDays.length){
//             return -1;
//         }
//         int min = Arrays.stream(bloomDays).min().getAsInt();
//         int max = Arrays.stream(bloomDays).max().getAsInt();

//         for(int day = min; day <= max; day++){
//             if(isPossible(bloomDays, day, m, k)){
//                 return day;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
//         int k = 3;
//         int m = 2;

//         bouquets garden = new bouquets();
//         int result  = garden.minDaysToMakeBouquets(bloomDays, m, k);
//         if(result == -1){
//             System.out.println("We cannot make the bouqute");
//         } else{
//             System.out.println("We can make the bouquet on the day : " + result);
//         }
//     }
// }