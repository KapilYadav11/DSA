// Problem Statement: You are given an array of integers 'arr' and an integer i.e. a threshold value 'limit'. Your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it, the sum of the division's result is less than or equal to the given threshold value.

import java.util.Arrays;

public class smallestDivisor {
    private int sumByD(int[] arr, int div){
        int sum = 0;
        for(int nums: arr){
            sum += Math.ceil((double)nums / div);
        }
        return sum;
    }
    public int findSmallestDivisor(int[] arr, int limit){
        if(arr.length > limit){
            return -1;
        }

        int low = 1;
        int high  = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if(sumByD(arr, mid) <= limit){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String [] args){
        int[] arr = {1,2,3,4,5};
        int limit = 8;
        smallestDivisor sol = new smallestDivisor();
        int result = sol.findSmallestDivisor(arr, limit);
        System.out.println("The smallest divisor is as: " + result);
    }
}



//BRUTE FORCE APPROACH
// public class smallestDivisor {
//     public int findSmallestDivisor(int[] arr, int limit){
//         int n = arr.length;

//         int max = Integer.MIN_VALUE;
//         for(int nums: arr){
//             max = Math.max(max, nums);
//         }
//         for(int d = 1; d <= max; d++){
//             int sum = 0;
//             for(int i = 0; i < n; i++){
//                 sum += Math.ceil((double)arr[i] / d);
//             }
//             if(sum <= limit){
//                 return d;
//             }
//         }
//         return -1;
//     }    

//     public static void main(String [] args){
//         int[] arr = {1, 2, 3, 4, 5};
//         int limit = 8;

//         smallestDivisor sol = new smallestDivisor();
//         int result = sol.findSmallestDivisor(arr, limit);
//         System.out.println("Smallest divisor is as: " + result);
//     }
// }
