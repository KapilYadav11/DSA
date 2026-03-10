// THE GIVEN BELOW IS THE BETTER SOLUTION BY USING THHE HASH MAP

// import java.util.HashMap;
// import java.util.Map;

// public class majorityEle {

//     public int majorityElement(int[] nums) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         int n = nums.length;

//         // Count frequency of each element
//         for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         // Find majority element
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > n / 2) {
//                 return entry.getKey();
//             }
//         }

//         // If no majority element found
//         return -1;
//     }

//     public static void main(String[] args) {

//         int[] nums = {2, 2, 1, 1, 1, 2, 2};

//         majorityEle obj = new majorityEle();

//         int result = obj.majorityElement(nums);

//         System.out.println("Majority Element is: " + result);
//     }
// }

   


//THE GIVEN BELOW IS THE BRUTE FORCE APPROACH
// public class majorityEle {
//     public int majorityElement(int[] nums){
//         int n = nums.length;

//         for(int i = 0; i < n; i++){
//             int cnt = 0;
            
//             for(int j = 0; j < n; j++){
//                 if(nums[j] == nums[i]){
//                     cnt++;
//                 }
//             }

//             if(cnt > (n/2)){
//                 return nums[i];
//             }
//         }

//         return -1;

//     }

//     public static void main(String [] args){
//         int[] nums = {2,2,1,1,1,2,2};

//         majorityEle sol = new majorityEle();

//         int ans = sol.majorityElement(nums);

//         System.out.println("The majority of the elemennt from the given arr is : " + ans);

//     }
// }
