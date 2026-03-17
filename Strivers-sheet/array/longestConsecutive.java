//Problem Statement: Given an array nums of n integers.

//Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.



// THE OPTIMAL APPROACH
import java.util.*;

public class longestConsecutive {

    public int longestConsecutiveElem(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }

        int longest = 1;
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        for (int it : st) {
            if (!st.contains(it - 1)) {
                int cnt = 1;
                int x = it;

                while (st.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        longestConsecutive sol = new longestConsecutive();
        int[] a = {100, 4, 200, 1, 3, 2};

        int ans = sol.longestConsecutiveElem(a);

        System.out.println("The longest consecutive sequence is : " + ans);
    }
}







// BRUTE FORCE APPROACH
// public class longestConsecutive {
//     private boolean linearSearch(int[] arr, int num){
//         int n = arr.length;
//         for(int i = 0; i < n; i++){
//             if(arr[i] == num)
//                 return true;
//         }
//         return false;
//     }

//     public int longestConsecutiveElem(int[] nums){
//         if(nums.length == 0){
//             return 0;
//         }

//         int n = nums.length;
//         int longest = 1;


//         for(int i = 0; i < n; i++){
//             int x = nums[i];
//             int cnt = 1;

//             while (linearSearch(nums, x+1) == true) {
//                 x += 1;
//                 cnt += 1;
//             }

//             longest = Math.max(longest, cnt);
//         }

//         return longest;

//     }

//     public static void main(String [] args){
//         longestConsecutive sol = new longestConsecutive();
//         int[] arr = {100, 4, 200, 1, 3, 2};

//         int ans = sol.longestConsecutiveElem(arr);
        
//         System.out.println("The longest consecutive sequence is : " + ans);
//     }
// }
