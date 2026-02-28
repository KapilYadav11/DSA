//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.


public class Solution {

    public boolean isSortedArr(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;   // Not sorted
            }
        }
        return true;   // Sorted
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,8,9};
        int n = arr.length;

        Solution sol = new Solution();
        System.out.println( sol.isSortedArr(arr, n) ? "True" : "False");
    }
}