//Problem Statement:Given an integer array arr of size N, sorted in ascending order (with distinct values), the array is rotated at any index which is unknown. Find the minimum element in the array.

public class minArr {
    public int findMinVal(int[] nums){
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            } else{
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String [] args){
        int[] nums = {4, 5, 6, 7, 0,1, 2};
        minArr sol = new minArr();
        int result = sol.findMinVal(nums);
        System.out.println("The Minimum value from the array is as: " + result);
    }
}



//BRUTE FORCE APPROACH 
// public class minArr {
//   public int findMinVal(int[] arr){
//     int minVal = Integer.MAX_VALUE;
//     for(int i = 0; i < arr.length; i++){
//         minVal = Math.min(minVal, arr[i]);
//     }
//     return minVal;

//   } 
//   public static void main(String [] args){
//     int[] arr = {4, 5, 6, 7, 1, 2};
//     minArr sol = new minArr();
//     int ans = sol.findMinVal(arr);
//     System.out.println("The minimum value is as :" + ans);
//   } 
// }
