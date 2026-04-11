//Problem Statement: Given a sorted array of N integers, write a program to find the index of the last occurrence of the target key. If the target is not found then return -1. Note: Consider 0 based indexing

public class FirstLast {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
        
    }
    private int findFirst(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                res = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }    
            return res;
    }

    private int findLast(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                res = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                    low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }        
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        FirstLast sol = new FirstLast();
        int[] ans = sol.searchRange(nums, target);
       System.out.println("The answer is: [" + ans[0] + ", " + ans[1] + "]");
    }
}