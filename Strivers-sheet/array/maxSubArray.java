//Problem Statement: Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.

//THIS IS THE BETTER SOLUTION BY USING THE KADANE'S ALGORITHM;
public class maxSubArray {
    public int maxSubArraySum(int[] arr){
        long max = Integer.MIN_VALUE;

        long sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return (int) max;

    }

    public static void main(String [] args){
        maxSubArray sol = new maxSubArray();
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = sol.maxSubArraySum(arr);

        System.out.println("The maxSubArraySUm is :" + maxSum);
    }
}







//THE BETTER SOLUTION IS AS FOLLOWS
// public class maxSubArray {
//     public int maxSubArraySum(int[] arr){
//         int max = Integer.MIN_VALUE;
//         for(int start = 0; start < arr.length; start++){
//             int sum = 0;

//             for(int end = start; end < arr.length; end ++){
//                 sum += arr[end];

//                 max = Math.max(max, sum);
//             }
//         }
//         return max;
//     }

//     public static void main(String [] args){
//         maxSubArray sol = new maxSubArray();
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

//         int maxSum = sol.maxSubArraySum(arr);

//         System.out.println("The maximum sum of the subArray is as :" + maxSum);
//     }
// }




// THE BRUTE FORCE SOLUTION
// public class maxSubArray {
//     public int maxSubArraySum(int[] arr){
//         int max = Integer.MIN_VALUE;
//         for(int start = 0; start < arr.length; start++){
//             for(int end = start; end < arr.length; end++){
//                 int sum = 0;
                
//                 for(int k = start; k <= end; k++){
//                     sum += arr[k];
//                 }
//                 max = Math.max(max, sum);
//             }
//         }
//         return max;
//     }
//     public static void main(String [] args){
//         maxSubArray sol = new maxSubArray();
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

//         int maxSum = sol.maxSubArraySum(arr);

//         System.out.println("The maximum  SubArray sum is :" + maxSum);
//     }
// }