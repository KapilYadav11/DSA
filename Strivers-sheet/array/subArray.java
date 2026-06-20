// Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k. A subarray is a contiguous non-empty sequence of elements within an array.

import java.util.HashMap;

public class subArray {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        int cnt = 0;
        int prefixSum = 0;

        mpp.put(0,1);

        for(int i = 0; i < n; i++){
            prefixSum += nums[i];
            int remove = prefixSum - k;
            
            if(mpp.containsKey(remove)){
                cnt += mpp.get(remove);
            }

            mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        subArray sol = new subArray();
        int[] arr = {1,1,1};
        int k = 2;
        int res = sol.subarraySum(arr, k);
        System.out.println("ans is: " + res);
    }
}





// THE BRUTE FORCE APPROACH
// public class subArray {
//     public int subArraySum(int[] arr, int k){
//         int n = arr.length;
//         int count = 0;

//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){

//                 int sum = 0;

//                 for(int m = i; m <= j; m++){
//                     sum += arr[m];
//                 }

//                 if(sum == k){
//                     count++;
//                 }
//             }
//         }
//         return count;

//     }
//     public static void main(String [] args){
//         subArray sol = new subArray();
//         int[] arr = {3,1,2,4};
//         int k = 6;

//         int ans = sol.subArraySum(arr, k);

//         System.out.println("The number of the sub array with sum k : " + ans);
//     }
// }