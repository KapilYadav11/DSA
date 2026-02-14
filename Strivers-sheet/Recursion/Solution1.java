package Recursion;

//Problem Description: Given an integer N, write a program to print your name N times.


public class Solution1 {
    public static void printName(String name, int count, int N ){

        if(count == N){
            return;
        }

        System.out.println(name);


        printName(name, count + 1, N);

    }

    public static void main(String [] args){
        Solution1 sol = new Solution1();
        int N = 5;
        String name = "Kapil";

        sol.printName(name, 0, N);
    }
}
