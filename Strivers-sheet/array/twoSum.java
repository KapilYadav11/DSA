// Problem Statement: Given an array of integers arr[] and an integer target.

//1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

//2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.


// THE BELOW IS THE BETTER APPROACH USING THE HASHMAP

import java.util.HashMap;

public class twoSum {
    public String twoSumExists(int[] arr, int target){
        HashMap<Integer, Integer>map = new HashMap<>();
        int n =  arr.length;

        for(int i = 0; i < n; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return "Yes";
            }

            map.put(arr[i], i);
        }

        return "No";


    }

    public int[] twoSumIndices(int[] arr, int target){
        HashMap<Integer, Integer>map = new HashMap<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
               return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String [] args){
        twoSum Sol = new twoSum();
        int[] arr = {2,6,5,8,11};
        int target = 15547;

        System.out.println(Sol.twoSumExists(arr, target));
        int[] res = Sol.twoSumIndices(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}






// THE BELOW IS THE BRUTE FORCE APPROACH
// public class twoSum {
//     public String twoSumExists(int[] arr, int target){
//         int n = arr.length;

//         for(int i = 0; i<n; i++){
//             for(int j = i+1; j <  n; j++){
//                 if(arr[i] + arr[j] == target){
//                     return "yes";
//                 }
//             }
//         }
//         return "no";
//     }

//     public int[] twoSumIndices(int[] arr, int target){
//         int n = arr.length;

//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 if(arr[i] + arr[j] == target){
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{-1, -1};

//     }
//     public static void main(String [] args ){
//         twoSum sol  =  new twoSum();
//         int[] arr = {2,6,5,8,11};
//         int target = 14;

//         System.out.println(sol.twoSumExists(arr, target));

      
//         int[] res = sol.twoSumIndices(arr, target);
//         System.out.println("[" + res[0] + ", " + res[1] + "]");
//     }
// }