// DO IT AGAIN JYADA SAMAJH NHI AAYA HAI YEH 
import java.util.*;
public class SubArrayKInteger {
    public int atMostk(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int cnt = 0;
        for(int right = 0; right < arr.length; right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            if(map.get(arr[right]) == 1){
                k--;
            }

            while (k < 0) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if(map.get(arr[left]) == 0){
                    k++;
                }
                left++;
            }
            cnt += (right - left + 1);
        }
        return cnt;
    }

    public int subarraysWithKDistinct(int[] arr, int K) {
        return atMostk(arr, K) - atMostk(arr, K - 1);
    }

    public static void main(String[] args) {
        SubArrayKInteger sol = new SubArrayKInteger();
        int[] nums = {1, 2, 1, 2, 3};
        int K = 2;
        int res = sol.subarraysWithKDistinct(nums, K);
        System.out.println("SubArray with exactly k is: " + res);
    }
}

//THIS IS THE BRUTE FORCE METHOD
// import java.util.*;
// public class SubArrayKInteger {
//     public int subArrayWithKDistinct(int[] nums, int k){
//         int cnt = 0;
//         int n = nums.length;
//         for (int i = 0; i < n; i++){
//             Map<Integer, Integer> map = new HashMap<>();
//             for(int j = i; j < n; j++){
//                 map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

//                 if(map.size() == k){
//                     cnt++;
//                 }

//                 if(map.size() > k){
//                     break;
//                 }
//             }
//         }
//         return cnt;
//     }

//     public static void main(String[] args){
//         SubArrayKInteger sol = new SubArrayKInteger();
//         int[] nums = {1, 2, 1,2, 3};
//         int k = 2;
//         int ans = sol.subArrayWithKDistinct(nums, k);
//         System.out.println("subArray with the k differnet integer: " + ans);
//     }
// }
