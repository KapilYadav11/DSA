//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

//If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.


public class Solution2 {
    public int removeDuplicate(int [] nums){
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;


    }

    public static void main(String [] args){
        int [] nums = {0,0,1,1,1,1,2,2,2,3,3,4};
        Solution2 sol = new Solution2();
        int k = sol.removeDuplicate(nums);
        System.out.println("Unique count = " + k);
        System.out.println("After removing array duplicate values ");
        for(int x = 0; x<k; x++){
            System.out.println(nums[x] + " ");
        }

    }
    
}
