//Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.


import java.util.*;

public class nextPermutation {
    public void findNextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: Piche se breakpoint dhoondo (Pehla dip)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: Agar koi breakpoint nahi mila (Array purely descending hai)
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Piche se nums[index] se just bada number dhoondo aur swap karo
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 4: Breakpoint ke aage wale part ko reverse kar do
        reverse(nums, index + 1, n - 1);
    }

    // Swap karne ke liye helper function
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse karne ke liye helper function
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        nextPermutation sol = new nextPermutation();
        int[] nums = { 2, 1, 5, 4, 3, 0 };

        sol.findNextPermutation(nums);

        
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();


    }
}