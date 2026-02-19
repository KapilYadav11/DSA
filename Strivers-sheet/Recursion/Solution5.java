package Recursion;

//Problem Statement: Given a number X,  print its factorial.

public class Solution5 {
    public static int factorial(int n){
        if(n == 0){
            return 1;
    }

    return n * factorial(n - 1);
}    

    public static void main(String [] args){
        int n = 5;
        System.out.println(factorial(n));
    }
    
}
