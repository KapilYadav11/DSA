import java.util.*;

// OPTIMAL sOLUTION
public class Leetcode1752 {
    public boolean check(int[] nums){
        int n = nums.length;
        int peak = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i + 1) % n]){
                peak++;
            }
        }
        return peak <= 1;
    }


//BETTER SOLUTION
// public class Leetcode1752 {
//     public boolean check(int[] nums){
//         int n = nums.length;
//         int[] sorted = nums.clone();
//         Arrays.sort(sorted);

//         for(int r = 0; r < n; r++){
//             boolean isSorted = true;
//             for(int i = r; i < n; i++){
//                 if(sorted[i] != nums[(i +  r) % n]){
//                     isSorted =false;
//                     break;
//                 }
//             }
//             if(isSorted){
//                 return true;
//             }
//         }
//         return false;
//     }





//BRUTE FORCE APPROAch
// public class Leetcode1752 {
//     public boolean check(int[] nums){
//         int n = nums.length;
//         int[] sorted = new int[n];

//         for(int r = 0; r < n; r++){
//             int idx = 0;
//             for(int i = r; i < n; i++){
//                 if(sorted[idx] == nums[i]){
//                     idx++;
//                 }
//             }

//             for(int i = 0; i < n; i++){
//                 if(sorted[idx] == nums[i]){
//                     idx++;
//                 }
//             }

//             boolean isSorted = true;
//             for(int i = 0; i < n - 1; i++){
//                 if(sorted[i] > sorted[i + 1]){
//                     isSorted = false;
//                     break;
//                 }
//             }
//             if(isSorted){
//                 return true;
//             }
//         }
//         return false;
//     }

    public static void main(String[] args) {
        Leetcode1752 sol = new Leetcode1752();
        int[] nums = {3, 4, 5, 1, 2};
       System.out.println(sol.check(nums) ? "True" : "False");

    }
}