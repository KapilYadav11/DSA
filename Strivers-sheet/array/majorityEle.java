public class majorityEle {

    public int majorityElementIs(int[] nums){
        int n = nums.length;

        int cnt = 0;
        int el = 0;

        for(int i = 0; i < n; i++){

        //Agar pichel saare votes cancel ho chuke hain,
        // toh naya element (nums[i]) hamara naya candidate ban jayega.
            if(cnt == 0){
                cnt = 1;
                el = nums[i];

        //Agar current element wahi hai jo hamara candidate hai,
        // toh uski power (cnt) badha do.
                 if(el == nums[i]){
                    cnt++;
                }

        //  Agar koi doosra element dikhta hai, 
        // toh wo candidate ke ek vote ko cancel kar dega (cnt--).
                else{
                    cnt--;
                }
            }
        }

        int cnt1 = 0; // Naya counter sirf winner ko count karne ke liye.
        for(int i = 0; i < n; i++){
            if(nums[i] == el){
                cnt1++; // Poore array mein candidate 'el' kitni baar hai, count karo.
            }
        }

        // Final Check: Kya count array ki half length se bada hai?
        if(cnt1 > ( n / 2)){
            return el; // Haan, toh winner return karo.
        }

        return -1; // Nahi, toh matlab koi majority element nahi hai.

    }
    public static void main(String [] args){
        majorityEle sol = new majorityEle();
        int[] nums = { 2,2,1,1,1,1,1,2,2,2};

        int ans = sol.majorityElementIs(nums);

        System.out.println("THe majority of element is find by optimal sol is likely to be :" + ans);
    }
}






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
