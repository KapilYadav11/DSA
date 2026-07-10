public class SingleDuplicate {

    // yeh wala code thoda jyada samajh aaya 
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            // Hum check karenge ki mid ke left side mein kitne elements hain
            // Agar elements even hain, toh isLeftEven true hoga
            boolean isLeftEven = (mid - low) % 2 == 0;

            if(nums[mid] == nums[mid + 1]){
                if(isLeftEven){
                    // Agar left side even hai aur mid ka pair right wale se ban raha hai,
                    // iska matlab single element right side mein hai.
                    low = mid + 2;
                } else {
                    // Agar left side odd hai, toh single element left side mein hi chupa hai.
                    high = mid - 1;
                }
            } else if(mid > 0 && nums[mid] == nums[mid - 1]){
                if(isLeftEven){
                    // Agar left side even hai aur mid ka pair left wale se ban raha hai,
                    // iska matlab ek element left side mein kam pad gaya (jo ki single element hai).
                    high = mid - 2;
                } else {
                    // Agar left side odd hai, toh single element right side mein hai.
                    low = mid + 1;
                }
            } else {
                // Agar na left se match hua na right se, toh mid hi single element hai.
                return nums[mid];
            }
        }
        return nums[low]; 
    

    // public int singleNonDuplicate(int[] nums) {
    //     int n = nums.length;
    //     if (n == 1) {
    //         return nums[0];
    //     }

    //     if (nums[0] != nums[1]) {
    //         return nums[0];
    //     }

    //     if (nums[n - 1] != nums[n - 2]) {
    //         return nums[n - 1];
    //     }

    //     // Keeping your original boundaries
    //     int low = 0, high = n - 1;
    //     while (low <= high) {
    //         int mid = (low + high) / 2;

    //         // Fix: Added boundary guards (mid > 0) and (mid < n - 1)
    //         if ((mid == 0 || nums[mid] != nums[mid - 1]) &&
    //                 (mid == n - 1 || nums[mid] != nums[mid + 1])) {
    //             return nums[mid];
    //         }

    //         if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
    //                 (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
    //             low = mid + 1;
    //         } else {
    //             high = mid - 1;
    //         }
    //     }
    //     return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        SingleDuplicate sol = new SingleDuplicate();
        int ans = sol.singleNonDuplicate(arr);
        System.out.println("The single element is: " + ans);

    }
}
