// // Problem Statement: Given a circular integer array arr, return the next greater element for every element in arr.
// //The next greater element for an element x is the first element greater than x that we come across while traversing the array in a clockwise manner.
// //If it doesn't exist, return -1 for that element element.

import java.util.Stack;

public class NextGreatElem2 {
    public int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> s = new Stack<>();

        for(int i = 2 * n - 1; i >= 0; i--){
            int indx = i % n;
            int currElem = arr[indx];

            while (!s.isEmpty() && s.peek() <= currElem) {
                s.pop();
            }
            if(i < n){
                if (s.isEmpty()) {
                    ans[indx] = -1;
                }
                else{
                    ans[indx] = s.peek();
                }
            }
            s.push(currElem);
        }
        return ans;

    }
    public static void main(String [] args){
        NextGreatElem2 sol = new NextGreatElem2();
        int[] arr = {5,7,1,7,6,0};
        int[] result = sol.nextGreaterElement(arr);

        for (int nums : result) {
            System.out.print(nums + " ");
        }
    }
}


// //BRUTE FORCE APPROACH
// import java.util.*;
// public class NextGreatElem2 {
//     public int[] nextGreaterElement(int[] arr){
//         int n =  arr.length;

//         int[] ans = new int[n];
//         Arrays.fill(ans, -1);

//         for(int i = 0; i < n; i++){
//             int currElem =  arr[i];

//             for(int j = 1; j < n; j++){
//                 int indx = (i + j) % n;

//                 if(arr[indx] > currElem){
//                     ans[i] = arr[indx];
//                     break;
//                 }
//             }
//         }
//         return ans;

//     }
//     public static void main(String [] args){
//         NextGreatElem2 sol = new NextGreatElem2();
//         int[] arr = {5, 7, 1, 7, 6, 0};
//         int[] result = sol.nextGreaterElement(arr);

//         System.out.println("The next greater elements are: ");
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
//     }
// }
