package Recursion; // 1. Package first

//Problem Statement: You are given an array. The task is to reverse the array and print it.


import java.util.*; // 2. Imports second

public class Solution6 { // 3. Class starts
    
    public void reverseArray(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            p1++;
            p2--;
        }
    }

    // This must be INSIDE the class
    public static void main(String[] args) {
        Solution6 sol = new Solution6();

        int[] arr = {1, 2, 3, 4, 5};

        sol.reverseArray(arr);

        for (int num : arr) {
            System.out.print(num + " "); // Changed to print for better readability
        }
    }
} // Class ends here