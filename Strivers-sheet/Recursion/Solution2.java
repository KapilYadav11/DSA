package Recursion;

//Problem Description: Given an integer N, write a program to print numbers from 1 to N.


public class Solution2 {
    public static void printNumbers(int current, int n){

        if(current>n){
            return;
        }

        System.out.println(current + " ");
 
        printNumbers(current + 1, n);
    }

    public static void main(String [] args){
        Solution2 sol = new Solution2();
        int n = 10;

        sol.printNumbers(1, n);
        System.out.println();
    }
}
