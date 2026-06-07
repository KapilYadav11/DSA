public class SubArraySum {
    public int numSubArrayWithSum(int[] nums, int goal){
        return atMost(nums, goal) -atMost(nums, goal - 1);
    }    
    private int atMost(int[] nums, int k){
        if(k < 0){
            return 0;
        }    
        int left = 0;
        int sum  = 0;
        int cnt = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            cnt += (right - left + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        SubArraySum sol = new SubArraySum();
        int res = sol.numSubArrayWithSum(nums, goal);
        System.out.println("The o/p is: " + res);
    }
}

//BRUTE FORCE METHOD
// public class SubArraySum {
//     public int numSubArrayWithSum(int[] nums, int goal){
//         int cnt = 0;
//         for(int start = 0; start < nums.length; start++){
//             int sum = 0;

//             for(int end = start; end < nums.length; end++){
//                 sum += nums[end];

//                 if(sum == goal){
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 0, 1, 0, 1};
//         int goal = 2;
//         SubArraySum sol = new SubArraySum();
//         int result = sol.numSubArrayWithSum(nums, goal);
//         System.out.println("The SubArray With the Sum: " + result);
//     }
// }
