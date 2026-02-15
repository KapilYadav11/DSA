package Recursion;

// Problem Description: Given an integer N, write a program to print numbers from N to 1.


public class Solution3 {
    public static void printNumbers(int current){
        if(current < 1){
            return;
        }

        System.out.println(current + " ");

        printNumbers(current - 1);

    }

    public static void main(String [] args){
        Solution3 sol = new Solution3();
        int n = 10;

        sol.printNumbers(n);
        System.out.println();
    }
}
