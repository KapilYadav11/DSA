package Recursion;

public class Solution4 {
    public int sumOfNaturalNumbers(int N){

        if(N == 1){
            return 1;
        }
        return N + sumOfNaturalNumbers(N-1);
        
    }

    public static void main(String [] args){
        Solution4 sol = new Solution4();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number to get the summation");
        int N = sc.nextInt();
        System.out.println("The sum of the numbers is " + sol.sumOfNaturalNumbers(N));
        sc.close();
    }
}       
