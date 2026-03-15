//Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

import java.util.*;
public class rearrangeArr {
    public int[] rearrangeArray(int[] arr, int n){
        int[] ans = new int[n];

        int posIndex = 0, negIndex = 1;

        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                ans[negIndex] = arr[i];
                negIndex += 2;
            } else{
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }

    public static void main(String [] args){
        rearrangeArr sol = new rearrangeArr();
        int[] arr = {1,2,-4,-5};
        int n =  arr.length;

        int[] result = sol.rearrangeArray(arr, n);

        System.out.print("The array after the re-arranging is as : ");

        for (int nums : result) {
            System.out.print(nums + " ");
        }
    }
}



// THE BRUTE FORCE APPROACH :
// import java.util.*;
// public class rearrangeArr {
//     public int[] rearrangeArray(int[] arr, int n){
//         List<Integer> pos = new ArrayList<>();
//         List<Integer> neg = new ArrayList<>();

//         for(int i = 0; i < n; i++){
//             if(arr[i] > 0){
//                 pos.add(arr[i]);
//             } else{
//                 neg.add(arr[i]);
//             }
//         }

//         for(int i = 0; i < n/2; i++){
//             arr[2 * i] = pos.get(i);
//             arr[2 * i + 1] = neg.get(i);
//         }

//         return arr;
       
//     }

//     public static void main(String [] args){
//         rearrangeArr sol = new rearrangeArr();
//         int[] arr = {1, 2, -4, -5};
//         int n = arr.length;
//         int[] result = sol.rearrangeArray(arr, n);

//         System.out.print("The re- Arrange array is as :");

//         for (int num : result) {
//             System.out.print( num + " ");
//         }

//     }
// }
