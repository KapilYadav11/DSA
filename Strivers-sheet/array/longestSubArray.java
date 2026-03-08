//Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

public class longestSubArray {
    public int fiindLongestSubArray(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;

        int left = 0, right = 0;

        int sum = nums[0];

        while (right < n) {
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += nums[right];
            }

        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        longestSubArray sol = new longestSubArray();

        int res = sol.fiindLongestSubArray(nums, k);

        System.out.println("THe longest subArray is the :" + res);
    }
}

// BRUTE FORCE APPROACH
// public class longestSubArray {
// public static int findLongestSubArray(int[] nums, int k){
// int n = nums.length;
// int maxLength = 0;

// for(int startIndex = 0; startIndex < n; startIndex++){

// for(int endIndex = startIndex; endIndex < n; endIndex++){

// int currentSum = 0;
// for(int i = startIndex; i <= endIndex; i++){
// currentSum += nums[i];

// }

// if(currentSum == k){
// maxLength = Math.max(maxLength, endIndex - startIndex + 1);
// }
// }

// }
// return maxLength;

// }
// public static void main(String [] args){
// int[] nums = {-1,1,1};
// int k = 1;

// longestSubArray sol = new longestSubArray();

// int ans = sol.findLongestSubArray(nums, k);

// System.out.println("The longest subarry is the : " + ans);

// }
// }
