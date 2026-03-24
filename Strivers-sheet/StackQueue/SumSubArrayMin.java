//Problem Statement: Given an array of integers arr of size n, calculate the sum of the minimum value in each (contiguous) subarray of arr. Since the result may be large, return the answer modulo 10⁹ +7.


import java.util.*;
public class SumSubArrayMin {

    private int[] findNSE(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = n - 1; i >= 0; i--){
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            ans[i] = !s.isEmpty() ? s.peek() : n;
            s.push(i);
        }
        return ans;
    }

    private int[] findPSEE(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++){
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
                s.pop();
            }

            ans[i] = !s.isEmpty() ? s.peek() : -1;
            s.push(i);
        }
        return ans;
    }

    public int findSumSubArrMin(int[] arr){
        int n = arr.length;

        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);

        int mod = (int)1e9 + 7;
        int sum = 0;


        for(int i = 0; i < n; i++){
            int left = i - psee[i];
            int right = nse[i] - i;

            long freq = left * right * 1L;
            int val = (int)((freq * arr[i]) % mod);

            
            sum = (sum + val) % mod;
        }
        return  (int)sum;
    }
    public static void main(String [] args){
        SumSubArrayMin sol = new SumSubArrayMin();
        int[] arr = {3,1,2,5};

        int result = sol.findSumSubArrMin(arr);
        System.out.println("The sum of the mininmum value in the each suBArray  isd as: " + result);
    }    
}


// try again yeh wala code jyada samajh nhi aaya hai , fir se karna hai isko 4-5 baar