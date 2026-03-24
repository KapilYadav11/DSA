//Problem Statement: Given an integer array nums, determine the range of a subarray, defined as the difference between the largest and smallest elements within the subarray. Calculate and return the sum of all subarray ranges of nums.

//OPTIMIZED CODE 
import java.util.Stack;
public class SumSubArrRanges {

    private int[] findNSE(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums[s.peek()] >= nums[i]) s.pop();
            ans[i] = !s.isEmpty() ? s.peek() : n;
            s.push(i);
        }
        return ans;
    }

    private int[] findPSEE(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && nums[s.peek()] > nums[i]) s.pop();
            ans[i] = !s.isEmpty() ? s.peek() : -1;
            s.push(i);
        }
        return ans;
    }

    private int[] findNGE(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums[s.peek()] <= nums[i]) s.pop();
            ans[i] = !s.isEmpty() ? s.peek() : n;
            s.push(i);
        }
        return ans;
    }

    private int[] findPGEE(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && nums[s.peek()] < nums[i]) s.pop();
            ans[i] = !s.isEmpty() ? s.peek() : -1;
            s.push(i);
        }
        return ans;
    }

    private long sumSubArrayMin(int[] nums) {
        int n = nums.length;
        int[] nse = findNSE(nums);
        int[] psee = findPSEE(nums);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - psee[i];
            long right = nse[i] - i;
            sum += left * right * nums[i];
        }
        return sum;
    }

    private long sumSubArrayMax(int[] nums) {
        int n = nums.length;
        int[] nge = findNGE(nums);
        int[] pgee = findPGEE(nums);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pgee[i];
            long right = nge[i] - i; // Fixed: nge[i] - i
            sum += left * right * nums[i];
        }
        return sum;
    }

    public long subArrayRanges(int[] nums) {
        return sumSubArrayMax(nums) - sumSubArrayMin(nums);
    }

    public static void main(String[] args) {
        SumSubArrRanges sol = new SumSubArrRanges();
        int[] nums = {1, 4, 3, 2};
        long ans = sol.subArrayRanges(nums); // Fixed: Added (nums)
        System.out.println("Total Range Sum: " + ans);
    }
}


//BRUTE FORCE APPROACH
// public class SumSubArrRanges {
//     public int findSumSubArrayRanges(int[] nums){
//         int n = nums.length;
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             int smallest = nums[i];
//             int largest = nums[i];

//             for(int j = i; j < n; j++){
//                 largest = Math.max(largest, nums[j]);
//                 smallest = Math.min(smallest, nums[j]);

//                 sum += (largest - smallest);
//             }
//         }
//         return sum;
//     }
//     public static void main(String [] args){
//         SumSubArrRanges sol = new SumSubArrRanges();
//         int[] nums = {1,4,3,2};
//         int result = sol.findSumSubArrayRanges(nums);
//         System.out.println("The sum of the sub Array in the ranges is as : " + result);
//     }
    
// }
