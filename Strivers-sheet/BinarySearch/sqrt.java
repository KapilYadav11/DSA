//Problem Statement: You are given a positive integer n. Your task is to find and return its square root. If ‘n’ is not a perfect square, then return the floor value of sqrt(n).


public class sqrt {
    public int findSqrt(int x){
        if(x < 2){
            return x;
        } 
        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else{
                right = (int) mid - 1;
            }
        }
        return ans;

    }
    public static void main(String [] args){
        int x = 28;
        sqrt sol = new sqrt();
        int res = sol.findSqrt(x);
        System.out.println("The sqrt of the number is as :" + res);

    }
}
