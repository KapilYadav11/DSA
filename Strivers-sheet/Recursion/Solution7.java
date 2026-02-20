package Recursion;


//Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

public class Solution7 {
    public boolean isPalindrome(int i, String s){
        if(i >= s.length()/2 ){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return isPalindrome(i+ 1, s);

    }

    public static void main(String [] args){
        Solution7 sol = new Solution7();
        String s  = "madam";

        System.out.println(sol.isPalindrome(0, s));
    }
    
}

